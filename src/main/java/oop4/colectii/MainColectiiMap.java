package oop4.colectii;

import java.util.HashMap;
import java.util.Set;

public class MainColectiiMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Matematica", 6);
        map.put("Matematica", 7);
        map.put("Matematica", 8);
        map.put("Romana", 9);

        System.out.println(map.get("Matematica"));
        System.out.println(map.size()); // size is 1

        Set<String> setExtrasDinMap = map.keySet(); // Map-ul are doua coloane (key-value pair).
                                                    // Prima fiind un Set, deci valori unice

    }
}
