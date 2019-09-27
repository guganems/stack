import utils.Utils;

public class xmlToTxt {
    public static void main(String[] args) {
//        Utils.toGeorgian("C:\\Users\\Guga\\Desktop\\Guga\\stack\\georgian-datasets\\resources\\kawiki.xml");
//        Utils.removeNewLines("resources\\out.txt");
//        Utils.getWords("resources\\without_whitespaces.xml");
        Utils.sortWords("resources\\words.xml", "resources\\sorted.xml");
    }
}
