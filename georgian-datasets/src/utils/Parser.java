package utils;

class Parser {
    private String parsed;

    Parser(String line) {
        this.parsed = parse(line);
    }

    String getParsed() {
        return this.parsed;
    }

    private String parse(String line) {
        return line.replaceAll("[^ქწჭერღტთყუიოპასდფგჰჯჟკლზძხცჩვბნმშ ]", "");
    }
}
