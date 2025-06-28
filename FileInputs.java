package wordcount;

import java.io.*;
import java.util.*;

public class FileInputs {

    File inputFile = new File("D:\\word-count-architecture\\input-file.txt");
    File stopWords = new File("D:\\word-count-architecture\\stop_words.txt");
    File specialSymbols = new File("D:\\word-count-architecture\\special_symbols.txt");

    public String getInputFile() throws FileNotFoundException {

        Scanner scan = new Scanner(inputFile);
        String str = "";
        while (scan.hasNext()) {
            str = str + scan.next().toLowerCase() + " ";
        }
        scan.close();
        return str;
    }

    public String getStopWords() throws FileNotFoundException {

        Scanner scan = new Scanner(stopWords);
        String str = "";
        while (scan.hasNext()) {
            str = str + scan.next().toLowerCase() + " ";
        }
        scan.close();
        return str;
    }

    public String getSpecialSymbols() throws FileNotFoundException {

        Scanner scan = new Scanner(specialSymbols);
        String str = "";
        while (scan.hasNext()) {
            str = str + scan.next().toLowerCase() + " ";
        }
        scan.close();
        return str;
    }
}
