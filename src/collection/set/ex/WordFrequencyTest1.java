package collection.set.ex;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String test = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();
        String[] words = test.split(" ");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
}
