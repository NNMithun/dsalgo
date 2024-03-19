package recursion;

public class isPalindrome {

  public static void main(String[] args) {

    String A="aaaa";
    System.out.println(solve(A));

  }
  public static int solve(String A) {
    if(A.length()==1 || A.equals("")){
      return 1;
    }

    if(A.charAt(0)==A.charAt(A.length()-1)){
      return solve(A.substring(1,A.length()-1));
    }else {
      return 0;
    }

  }
}
