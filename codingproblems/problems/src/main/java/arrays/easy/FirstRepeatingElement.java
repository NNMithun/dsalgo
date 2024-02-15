package arrays.easy;

public class FirstRepeatingElement {
    public static void main(String[] args) {

        String input=null;
        int strLength=input.length();
        StringBuilder output= new StringBuilder();
        for(int i=0;i<strLength;i++){
            if(input.charAt(i)=='.'){
                output.append("[.]");
            }else {
                output.append(input.charAt(i));
            }
        }
        System.out.println(output.toString());
    }

}
