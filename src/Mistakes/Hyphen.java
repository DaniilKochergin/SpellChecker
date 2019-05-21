package Mistakes;

import Mistakes.DefaultMistakes;
import Source.Data;

import java.util.ArrayList;

public class Hyphen extends DefaultMistakes {

    public Hyphen(Data data){
        super(data, null);
    }

    @Override
    public ArrayList<String> getCorrectsWords(String word) {
        ArrayList<String> ans = new ArrayList<>();
        ans.add(word.replaceAll("-",""));
        for(int i=0;i<word.length();++i){
            ans.add(word.substring(0,i) + "-" + word.substring(i));
        }
        return ans;
    }
}
