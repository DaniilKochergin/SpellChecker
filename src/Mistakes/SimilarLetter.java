package Mistakes;

import Mistakes.DefaultMistakes;
import Source.Data;

import java.util.HashMap;
import java.util.Map;

public class SimilarLetter extends DefaultMistakes {
    public SimilarLetter(Data data) {
        super(data, similarVowels);
    }


    private static final HashMap<String, String> similarVowels = new HashMap<>(Map.of(
            "о", "а",
            "ё", "а",
            "ю", "у",
            "э", "и",
            "е", "и",
            "ы", "и",
            "я", "и",
            "б", "п",
            "з", "с",
            "г", "к"
    ));
}
