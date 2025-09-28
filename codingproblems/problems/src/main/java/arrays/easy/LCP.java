package arrays.easy;

public class LCP {
    public static void main(String[] args) {

        String[] str= {"flower", "flower","flower"};
        System.out.println(LCPVerticalScanning(str));

    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder str= new StringBuilder();

        for(int i=0 ; i<strs.length; i++){

            for(int j=0;j<strs.length-1;j++){

                String s1= strs[j];
                String s2= strs[j+1];
                if(s1.charAt(i)==(s2.charAt(i)))
                {

                }
            }
        }
        return new String();

    }
    public static String longestCommonPrefixSol1v1(String[] strs) {
        StringBuilder sb= new StringBuilder();
       if (strs.length>=2){
           String s1= strs[0];
           String s2= strs[1];

           int len=Math.min(s1.length(),s2.length());
           for (int j=0;j<len;j++){
               if(s1.charAt(j)==s2.charAt(j)){
                   sb.append(s1.charAt(j));
               }else {
                   break;
               }
           }
       }


            for(int i=2 ; i<strs.length; i++){
                String s3=strs[i];
                int len=Math.min(s3.length(),sb.length());
                for (int j=0;j<len;j++){
                    if(s3.charAt(j)!=sb.charAt(j)){
                       sb= new StringBuilder(sb.substring(0,j));
                        break;
                    }
                }


            }


            return  sb.toString();


        }
    public static String longestCommonPrefixSol1v2(String[] strs) {

            if(strs ==null || strs.length==0){
                   return "";
            }
            if (strs.length==1)return strs[0];
        StringBuilder prefix= new StringBuilder(strs[0]);


        for (int i=1;i<strs.length;i++){
                int j=0;
                int minLength=Math.min(prefix.length(),strs[i].length());
                while (j<minLength && prefix.charAt(j)==strs[i].charAt(j)){
                    j++;
                }
                prefix.setLength(j);
                if (prefix.length()==0) return "";
            }

            return prefix.toString();



        }

    public static String LCPVerticalScanning_totallyWrongLogic(String[] s){


        if(s==null || s.length==0){
            return "";
        }
        StringBuilder prefix= new StringBuilder();
        int j=0;
        int i=0;

         while (j<s.length){
              while(i<s.length-1){
                  if(j>s[i].length() && j> s[i+1].length()){
                      return prefix.toString();
                  }
                  if(s[i].charAt(j)!=s[i+1].charAt(j)){
                      return prefix.toString();
                  }
                  i++;
              }
          prefix.append(s[i].charAt(j));
          i=0;
          j++;
         }

         return prefix.toString();

    }
    public static String LCPVerticalScanning(String[] s){

        StringBuilder prefix= new StringBuilder();
        if(s==null || s.length==0){
            return "";
        }


        for (int i=0; i<s[0].length();i++){
            char c= s[0].charAt(i);
            for (int j=0;j<s.length;j++){
                if (i>=s[j].length() || s[j].charAt(i)!=c){
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }

        return prefix.toString();

    }

        /*
        progressive shrinking approach
        Algorithm Description

            Check if strs is null or empty → return "".

            Initialize prefix with the first string.

            For each string from index 1 to end:

            Compare characters of the current string with prefix.

            Find the longest matching segment.

            Shorten prefix to that length.

            If prefix becomes empty → return "".

            Return prefix after all comparisons.

        */



}
