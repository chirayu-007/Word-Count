package wordcount;

import java.io.FileNotFoundException;

public class WordCount {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputs fl = new FileInputs();
        FilterWords fw = new FilterWords();

        System.out.println(fl.getInputFile());

//        System.out.println(fl.getStopWords());
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println(fw.RemoveStopWords());

//        System.out.println(fl.getSpecialSymbols());
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println(fw.RemoveSpecialSymbols() + " ");

    }

}
