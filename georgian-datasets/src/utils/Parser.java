package utils;

public class Parser {
    private String parsed;

    public Parser(String line) {
        this.parsed = parse(line);
    }

    public String getParsed() {
        return this.parsed;
    }

    private String parse(String line) {
        return line.replaceAll("[^ქწჭერღტთყუიოპასდფგჰჯჟკლზძხცჩვბნმშ ]", "");
    }
}
