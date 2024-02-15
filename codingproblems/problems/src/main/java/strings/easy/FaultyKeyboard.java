package strings.easy;

public class FaultyKeyboard {
    public static void main(String[] args) {
        //String s="AiBiCiDEFG";
        String s="siiuii";
        System.out.println(finalString(s));

    }
    //dont jump the gun
    public static String finalStringfailedLogic1(String s) {
        StringBuilder stringBuilder= new StringBuilder();
        long icount= s.chars().filter(c->c=='i').count();
        if(icount%2!=0){
            int lastIndexOfI=s.lastIndexOf("i");
            stringBuilder.append(s.substring(0,lastIndexOfI));
            stringBuilder.reverse();
            stringBuilder.append(s.substring(lastIndexOfI));
            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf("i"));
            return String.valueOf(stringBuilder).replaceAll("i","");

        }
        else {
            return s.replaceAll("i","");
        }


    }
    public static String finalStringfailedLogic2(String s) {
        StringBuilder sb= new StringBuilder();
        String[] saray= s.split("i");
        for (String str:saray) {
            sb.append(str).reverse();
        }
        return  sb.toString();


    }

    public static String finalStringfailedLogic3(String s) {
        StringBuilder sb= new StringBuilder();
        int prevIndex=0;

        for (int i=0;i<s.length();i++) {
            if(s.charAt(i)=='i'){
                sb.append(s.substring(prevIndex,i)).reverse();
                prevIndex=i+1;
            }

        }
        if(prevIndex<s.length()-1){
            sb.append(s.substring(prevIndex,s.length()-1));
        }
       return s.toString();


    }
    public static String finalString(String s) {
        StringBuilder sb= new StringBuilder();
        int prevIndex=0;

        for (int i=0;i<s.length();i++) {
            if(s.charAt(i)=='i'){
                sb.append(s.substring(prevIndex,i)).reverse();
                prevIndex=i+1;
            }

        }
        if(prevIndex<=s.length()-1){
            sb.append(s.substring(prevIndex,s.length()));
        }
        return sb.toString();
    }
}
