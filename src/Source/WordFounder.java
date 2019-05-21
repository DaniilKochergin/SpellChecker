package Source;

import Mistakes.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordFounder {
    public WordFounder(Data data) {
        this.data = data;
        defaultMistakes = new ArrayList<>(List.of(
                new DoubleLetter(data),
                new Hyphen(data),
                new SeqLetters(data),
                new SimilarLetter(data),
                new SkipLetter(data),
                new AddLetter(data)
        ));
    }


    public boolean exist(String world) {
        return data.exist(world);
    }

    public HashSet<String> giveAdvice(String word) {
        ArrayList<String> tmp = new ArrayList<>();
        for (DefaultMistakes defaultMistake : defaultMistakes) {
            tmp.addAll(defaultMistake.getCorrectsWords(word));
        }
        HashSet<String> advices = new HashSet<>();
        for(String advice:tmp){
            for (DefaultMistakes defaultMistake : defaultMistakes) {
                advices.addAll(defaultMistake.getSimilar(advice));
            }
        }
        return advices;
    }


    private final Data data;
    private final ArrayList<DefaultMistakes> defaultMistakes;
}
