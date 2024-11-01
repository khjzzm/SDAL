package io.sdal.string.manipulation;

import java.util.*;

public class MostCommonWord {

    public static String mostCommonWord(String p, String[] banned){
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> counts = new HashMap<>();

        String[] words = p.replaceAll("\\W+", " ").toLowerCase().split(" ");

        for(String w : words){
            if(!ban.contains(w)){
                counts.put(w, counts.getOrDefault(w, 0) + 1);
            }
        }
        Map.Entry<String, Integer> max = Collections.max(counts.entrySet(), Map.Entry.comparingByValue());
        return max.getKey();
    }

}
