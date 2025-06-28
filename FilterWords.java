package wordcount;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class FilterWords {

    FileInputs fi = new FileInputs();

    public String RemoveStopWords() throws FileNotFoundException {
        String input = fi.getInputFile();
        String inputCh[] = input.split(" ");

        String stop = fi.getStopWords();
        String stopCh[] = stop.split(" ");

        String newList = "";

        for (int i = 0; i < inputCh.length; i++) {
            String c = inputCh[i];
            int count = 0;
            for (int j = 0; j < stopCh.length; j++) {
                String d = stopCh[j];
                if (c.equalsIgnoreCase(d)) {
                    count++;
                }
            }
            if (count == 0) {
                newList = newList + c + " ";
            }
        }
        return newList;
    }

    public List<String> RemoveSpecialSymbols() throws FileNotFoundException {
    String input = RemoveStopWords();
    String special = fi.getSpecialSymbols();
    String regex = "[" + Pattern.quote(special) + "]";

    String newList = input.replaceAll(regex, "");
    newList = newList.replaceAll("[^a-zA-Z\\s]", "");
    newList = newList.replaceAll("\\s+", " ").trim();

    return Arrays.asList(newList.split(" "));
}

}
