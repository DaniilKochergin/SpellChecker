package Mistakes;

import Source.Data;

import java.util.ArrayList;
import java.util.HashMap;

public class SkipLetter extends DefaultMistakes {
    public SkipLetter(Data data) {
        super(data, null);
    }
    @Override
    public ArrayList<String> getCorrectsWords(String word){
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i < word.length();++i){
            ans.add(word.substring(0,i) + word.substring(i+1));
        }
        return ans;
    }
}
