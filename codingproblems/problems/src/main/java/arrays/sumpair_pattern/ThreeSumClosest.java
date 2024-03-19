package arrays.sumpair_pattern;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeSumClosest {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList= new ArrayList<>();
    arrayList.add( -5);
    arrayList.add( 1);
    arrayList.add( 4);
    arrayList.add( -7);
    arrayList.add( 10);
    arrayList.add( -7);
    arrayList.add( 0);
    arrayList.add( 7);
    arrayList.add( 3);
    arrayList.add( 0);
    arrayList.add( -2);
    arrayList.add( -5);
    arrayList.add( -3);
    arrayList.add( -6);
    arrayList.add( 4);
    arrayList.add( -7);
    arrayList.add( -8);
    arrayList.add( 0);
    arrayList.add( 4);
    arrayList.add( 9);
    arrayList.add( 4);
    arrayList.add( 1);
    arrayList.add( -8);
    arrayList.add( -6);
    arrayList.add( -6);
    arrayList.add( 0);
    arrayList.add( -9);
    arrayList.add( 5);
    arrayList.add( 3);
    arrayList.add( -9);
    arrayList.add( -5);
    arrayList.add( -9);
    arrayList.add( 6);
    arrayList.add( 3);
    arrayList.add( 8);
    arrayList.add( -10);
    arrayList.add( 1);
    arrayList.add( -2);
    arrayList.add( 2);
    arrayList.add( 1);
    arrayList.add( -9);
    arrayList.add( 2);
    arrayList.add( -3);
    arrayList.add( 9);
    arrayList.add( 9);
    arrayList.add( -10);
    arrayList.add( 0);
    arrayList.add( -9);
    arrayList.add( -2);
    arrayList.add( 7);
    arrayList.add( 0);
    arrayList.add( -4);
    arrayList.add( -3);
    arrayList.add( 1);
    arrayList.add( 6);
    arrayList.add( -3 );
    System.out.println(threeSumClosest(arrayList,-1));


  }
  public static int threeSumClosest(ArrayList<Integer> A, int B) {
    //sort the array
    //make a sliding window of size 3
    //take sum and store it in variable min
    //update the min as sliding window slides till the end of the array
    //return min

    Collections.sort(A);
    int closestSum=Integer.MAX_VALUE;
    for(int i=0;i<A.size()-2;i++){
      int sum=0;
      for(int j=i,count=0;count<3;j++,count++){
        sum+=A.get(j);
      }
      int diffSum=Math.abs(B-sum);
      if(B==sum){
        return sum;
      }
       else if(Math.abs(closestSum)>diffSum)
      {
        closestSum=sum;
      }

    }
    return closestSum;

  }
  public static int threeSumClosest_wrong(ArrayList<Integer> A, int B) {
    //sort the array
    //make a sliding window of size 3
    //take sum and store it in variable min
    //update the min as sliding window slides till the end of the array
    //return min

    Collections.sort(A);
    int closestSum=Integer.MAX_VALUE;
    for(int i=0;i<A.size()-2;i++){
      int sum=0;
      for(int j=i,count=0;count<3;j++,count++){
        sum+=A.get(j);
      }
      int diffSum=Math.abs(B-sum);
      if(B==sum){
        return sum;
      }
       else if(Math.abs(closestSum)>diffSum)
      {
        closestSum=sum;
      }

    }
    return closestSum;

  }


}
