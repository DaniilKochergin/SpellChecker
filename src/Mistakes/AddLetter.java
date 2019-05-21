package Mistakes;

import Source.Data;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class AddLetter extends DefaultMistakes {
    public AddLetter(Data data) {
        super(data, null);
    }

    @Override
    public ArrayList<String> getCorrectsWords(String word) {
        ArrayList<String> ans = new ArrayList<>();

        ArrayList<String> alphabet = new ArrayList<>();
        alphabet.add("a");
        alphabet.add("б");
        alphabet.add("в");
        alphabet.add("г");
        alphabet.add("д");
        alphabet.add("е");
        alphabet.add("ж");
        alphabet.add("з");
        alphabet.add("и");
        alphabet.add("й");
        alphabet.add("к");
        alphabet.add("л");
        alphabet.add("м");
        alphabet.add("н");
        alphabet.add("о");
        alphabet.add("п");
        alphabet.add("р");
        alphabet.add("с");
        alphabet.add("т");
        alphabet.add("у");
        alphabet.add("ф");
        alphabet.add("х");
        alphabet.add("ц");
        alphabet.add("ч");
        alphabet.add("щ");
        alphabet.add("ш");
        alphabet.add("ъ");
        alphabet.add("э");
        alphabet.add("ю");
        alphabet.add("я");
        alphabet.add("ь");
        alphabet.add("ё");


        StringBuilder res = new StringBuilder();
        for (String s : alphabet) {
            for (int j = 0; j < word.length(); ++j) {

                ans.add(word.substring(0, j) + s + word.substring(j));
            }
        }
        for (String s : alphabet) {
            ans.add(word + s);
        }
        return ans;
    }

}
