package Mistakes;

import Source.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddLetter extends DefaultMistakes {
    public AddLetter(Data data) {
        super(data, null);
        le
    }
    @Override
    public ArrayList<String> getCorrectsWords(String word){
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i < word.length();++i){
            ans.add(word.substring(0,i) +  word.substring(i));
        }
        return ans;
    }
    private final static ArrayList<String> letters = new ArrayList<>();
}
