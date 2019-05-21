package Mistakes;


import Source.Data;

import java.util.HashMap;
import java.util.Map;

public class DoubleLetter extends DefaultMistakes {
    public DoubleLetter(Data data){
        super(data, regulations);
    }


    private static final HashMap<String, String> regulations = new HashMap<>(Map.of(
            "пп", "п",
            "дд", "д",
            "вв", "в",
            "мм", "м",
            "тт", "т",
            "нн", "н",
            "сс", "с",
            "лл", "л"
    ));
}
