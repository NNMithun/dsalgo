package arrays;

import java.util.ArrayList;

public class CircleOfMonsters {

  public static void main(String[] args) {

    ArrayList<Integer> a= new ArrayList<>();
    a.add(7);
    a.add(2);
    a.add(5);
    ArrayList<Integer> b= new ArrayList<>();
    b.add(15);
    b.add(14);
    b.add(3);
    System.out.println(solve(a,b));;


  }
  public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
    int sum=0;
    int min=Integer.MAX_VALUE;
    sum=Math.max(0,A.get(0)-B.get(B.size()-1));
    for (int i=1;i<A.size();i++){
      sum+=Math.max(0,A.get(i)-B.get(i-1));
    }

    for (int i=1;i<A.size();i++){
      int val=sum-Math.max(0,A.get(i)-B.get(i-1))+A.get(i);
      if(min>val){
        min=val;
      }
    }
    int val=sum-Math.max(0,A.get(0)-B.get(B.size()-1))+A.get(0);

    if (min>val){
      min=val;
    }
    return min%((int)Math.pow(10,9)+7);

  }

}
