package utils;

import com.google.code.externalsorting.ExternalSort;
import java.io.*;

public class Utils {
    public static void toGeorgian(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            File fout = new File("resources\\out.txt");
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            while ((line = br.readLine()) != null) {
                Parser parser =  new Parser(line);
                String parsed = parser.getParsed();
                // Write to file
                bw.write(parsed);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void removeNewLines(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            File fout = new File("resources\\without_whitespaces.xml");
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            while ((line = br.readLine()) != null) {
                if (!line.replaceAll(" ", "").equals("")) {
                    bw.write(line);
                    bw.newLine();
                }
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getWords(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            File fout = new File("resources\\words.xml");
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split(" ");
                for (String each: lineWords) {
                    if (!each.equals("")) {
                        bw.write(each);
                        bw.newLine();
                    }
                }
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void sortWords(String inputName, String outputName) {
        try {
            ExternalSort.mergeSortedFiles(ExternalSort.sortInBatch(new File(inputName))
                    , new File(outputName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
