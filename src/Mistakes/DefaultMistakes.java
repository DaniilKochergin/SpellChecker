package Mistakes;

import Source.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class DefaultMistakes {
    public DefaultMistakes(Data data, HashMap<String, String> regulations){
        this.data = data;
        this.regulations = regulations;
    }
    public ArrayList<String> getSimilar(String word){
        ArrayList<String> correctedWords = getCorrectsWords(word);
        ArrayList<String> ans = new ArrayList<>();
        for (String correctedWord : correctedWords) {
            if (data.exist(correctedWord)) {
                ans.add(correctedWord);
            }
        }
        return ans;
    }
    public ArrayList<String> getCorrectsWords(String word) {
        ArrayList<String> ans = new ArrayList<>();
        for(Map.Entry<String, String> regulation:regulations.entrySet()){
            String key = regulation.getKey();
            String value = regulation.getValue();
            ans.add(word.replace(key,value));
            ans.add(word.replace(value,key));
        }
        return ans;
    }
    private final HashMap<String, String> regulations;
    private Data data;
}
