package easy;

import java.util.ArrayList;
import java.util.List;
//Leetcode ProblemeId:1773
public class MatchingRuleCountItems {
    public static void main(String[] args) {
        
    // String[][] a=  {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
     List<String> b=List.of("phone","blue","pixel");
     List<String> c=List.of("computer","silver","lenovo");
     List<String> d=List.of("phone","gold","iphone");
     List<List<String>> e= new ArrayList<>();
     e.add(b);
     e.add(c);
     e.add(d);
        System.out.println(countMatches(e,"color","silver"));
        //System.out.println(countMatches(e,"type","phone"));

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        /*if ruleKey type index 0, color index 1 and name index 2
        [type,color,name]
        [type,color,name]
        [type,color,name]
        [type,color,name]
        [type,color,name]
        int count=0
        int index=0;
        if(ruleKey==type) index=0
        else if (ruleKey==type)
        for(List<String> s:items){
            if(s.indexOf(index)==ruleValue){
            count++;
            }
        }
        */
        int count = 0;
        int index = -1;
        if (ruleKey == "type") index = 0;
        else if (ruleKey == "color") index = 1;
        else index = 2;
        for (List<String> s : items) {
            if (s.get(index) == ruleValue) {
                count++;
            }
        }
        return count;

    }
}
