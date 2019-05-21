package Mistakes;


import Source.Data;

import java.util.HashMap;
import java.util.Map;

public class SeqLetters extends DefaultMistakes {
    public SeqLetters(Data data) {
        super(data, seqLetters);
    }

    private static final HashMap<String, String> seqLetters = new HashMap<>(Map.of(
            "ч", "щ",
            "сц", "щ",
            "щ", "ш",
            "ш", "ч",
            "сщ", "ш",
            "тч", "ш",
            "стг", "сг",
            "тс", "ц",
            "дц", "ц",
            "хг", "г"
    ));
}
