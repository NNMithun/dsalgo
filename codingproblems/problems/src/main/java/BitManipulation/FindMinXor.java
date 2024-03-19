package BitManipulation;

import java.util.ArrayList;
import java.util.Collections;

public class FindMinXor {

  public static void main(String[] args) {
    ArrayList a= new ArrayList();
    a.add(1);
    a.add(4);
    a.add(6);
    a.add(8);
    System.out.println(findMinXor(a));;
  }
  public static int findMinXor(ArrayList<Integer> A) {

    Collections.sort(A);
    int minXor=Integer.MAX_VALUE;

    for(int i=0;i<A.size()-1;i++){
      if(minXor>(A.get(i)^A.get(i+1)))
       minXor=  A.get(i)^A.get(i+1);
    }
    return minXor;
  }
}
