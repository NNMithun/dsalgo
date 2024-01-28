package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
//Leetcode ProblemeId:771
public class NumJewelsInStones {
    public static void main(String[] args) {
        String jewels="aA";
        String stones="aAAbbbb";
        System.out.println(numJewelsInStones_HashMap(jewels,stones));
        System.out.println(numJewelsInStones_HashSet(jewels,stones));

    }

    public static int numJewelsInStones_HashMap(String jewels, String stones) {
        //intersection of jewels and stones
        //I have to trace both string atleast once
        //first I will trace the jewels--
        //check if the my stone is there in the jewel list
        //hashmap data structure suffice my requirement
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int totalJewels = 0;
        for (Character j : jewels.toCharArray()) {
            hashMap.put(j, 0);
        }
        for (Character c : stones.toCharArray()) {
            if (hashMap.containsKey(c)) {
                int count = hashMap.get(c) + 1;
                hashMap.put(c, count);
            }
        }
        for (Map.Entry<Character, Integer> a : hashMap.entrySet()) {
            totalJewels += a.getValue();
        }
        return totalJewels;
    }

    public static int numJewelsInStones_HashSet(String jewels, String stones){
        HashSet<Character> jewel= new HashSet<>();
        int jewelsIndStones=0;
        for (Character j:jewels.toCharArray()){
            jewel.add(j);
        }
        for(Character s:stones.toCharArray()){
            if(jewel.contains(s)){
                jewelsIndStones++;
            }
        }
        return jewelsIndStones;
    }
}
