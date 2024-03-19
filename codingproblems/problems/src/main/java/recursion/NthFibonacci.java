package recursion;

public class NthFibonacci {

  public static void main(String[] args) {

  }
  public static int findAthFibonacci(int A) {
    if(A==0){
      return 0;
    }
    if(A==1){
      return 1;
    }

    return findAthFibonacci(A-2)+findAthFibonacci(A-1);

  }
}
