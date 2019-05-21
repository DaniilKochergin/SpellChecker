package Source;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;

public class Data {
    public Data(File file) throws IOException {
        reader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8));
    }

    public void write(){
        for(String word:words){
            System.out.println(word);
        }
    }

    public void read() throws IOException {
        String s;
        while((s = reader.readLine()) != null){
            String[] splitedWords = s.split("\\s");
            words.addAll(Arrays.asList(splitedWords));
        }
    }

    public boolean exist(String world) {
        return words.contains(world);
    }

    public void close() throws IOException {
        reader.close();
    }

    private HashSet<String> words = new HashSet<>();
    private final BufferedReader reader;

}
