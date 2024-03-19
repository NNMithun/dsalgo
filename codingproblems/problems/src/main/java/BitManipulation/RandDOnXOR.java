package BitManipulation;

public class RandDOnXOR {

  public static void main(String[] args) {

    for (int i=0;i<100;i++){
      System.out.println(i+" ^ "+(i+2)+"="+ (i^(i+2)));
    }
  }



}
