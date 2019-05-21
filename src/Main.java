import Source.Data;
import Source.WordFounder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        File file = new File("input.txt");
        Data data = null;
        try {
            data = new Data(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            data.close();
        }
        try {
            data.read();
        } catch (IOException e){
            System.out.println(e.getMessage());
            data.close();
        }
        WordFounder wordFounder = new WordFounder(data);
        if (wordFounder.exist(word)){
            System.out.println("Word is correct!");
        } else{
            HashSet<String> advice = wordFounder.giveAdvice(word);
            System.out.println("Word isn't correct, list of similar words:");
            for (String advice1 : advice) {
                System.out.println(advice1);
            }
        }
    }
}
