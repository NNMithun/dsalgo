package arrays.sumpair_pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PairsWithGivenDifference {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();

    arrayList.add(1);
    arrayList.add(5);
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(2);
    System.out.println(solve(arrayList, 3));


  }
  public static int solve(ArrayList<Integer> A, int B) {
    int i=0;
    int j=1;
    HashMap<Integer, Integer> hm= new HashMap();
    int k=Integer.MAX_VALUE;
    int count=0;
    Collections.sort(A);
    while(i<A.size() && j<A.size()){
      int diff= A.get(j)-A.get(i);
      if(diff>B){
        i++;
      }else if(diff<B){
        j++;
      }else if(diff==B){
        if(!hm.containsKey(A.get(j)) && i!=j){
          count++;
          hm.put(A.get(j),A.get(i));
        }
        j++;

      }

    }
    return count;
  }
}
