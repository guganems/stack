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
        String parsed =  line.replaceAll("[^ქწჭერღტთყუიოპასდფგჰჯჟკლზძხცჩვბნმშ|}{\\[\\] ]",
                "");
        return replaceCharacters(parsed);
    }

    private String replaceCharacters(String parsed) {
        parsed = parsed.replaceAll("[|]", " ");
        parsed = parsed.replaceAll("[{]", " ");
        parsed = parsed.replaceAll("[}]", " ");
        parsed = parsed.replaceAll("[\\[]", " ");
        parsed = parsed.replaceAll("[:]", " ");
        return parsed.replaceAll("[]]", " ");
    }
}
