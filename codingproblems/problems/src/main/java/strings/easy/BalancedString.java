package strings.easy;

//Leetcode ProblemeId:1221
//important: Balance means pattern of - and +
public class BalancedString {
    public static void main(String[] args) {
        String s="RLRRRLLRLL";
        System.out.println(balancedStringSplit(s));

    }
    public static int balancedStringSplit(String s) {
        int ans=0;
        int count=0;
        for(char c:s.toCharArray()){
            count=c=='R'?count+1:count-1;
            if(count==0) ans++;
        }
       return ans;

    }
}
