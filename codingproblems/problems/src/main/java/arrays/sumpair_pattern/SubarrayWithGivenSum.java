package arrays.sumpair_pattern;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList= new ArrayList<>();
    arrayList.add( 42);
    arrayList.add(  9);
    arrayList.add(  38);
    arrayList.add(  36);
    arrayList.add(  48);
    arrayList.add(  33);
    arrayList.add(  36);
    arrayList.add(  50);
    arrayList.add(  38);
    arrayList.add(  8);
    arrayList.add(  13);
    arrayList.add(  37);
    arrayList.add(  33);
    arrayList.add(  38);
    arrayList.add(  17);
    arrayList.add(  25);
    arrayList.add(  50);
    arrayList.add(  50);
    arrayList.add(  41);
    arrayList.add(  29);
    arrayList.add(  34);
    arrayList.add(  18);
    arrayList.add(  16);
    arrayList.add(  6);
    arrayList.add(  49);
    arrayList.add(  16);
    arrayList.add(  21);
    arrayList.add(  29);
    arrayList.add(  41);
    arrayList.add(  7);
    arrayList.add(  37);
    arrayList.add(  14);
    arrayList.add(  5);
    arrayList.add(  30);
    arrayList.add(  35);
    arrayList.add(  26);
    arrayList.add(  38);
    arrayList.add(  35);
    arrayList.add(  9);
    arrayList.add(  36);
    arrayList.add(  34);
    arrayList.add(  39);
    arrayList.add(  9);
    arrayList.add(  4);
    arrayList.add(  41);
    arrayList.add(  40);
    arrayList.add(  3);
    arrayList.add(  50);
    arrayList.add(  27);
    arrayList.add(  17);
    arrayList.add(  14);
    arrayList.add(  5);
    arrayList.add(  31);
    arrayList.add(  42);
    arrayList.add(  5);
    arrayList.add(  39);
    arrayList.add(  38);
    arrayList.add(  38);
    arrayList.add(  47);
    arrayList.add(  24);
    arrayList.add(  41);
    arrayList.add(  5);
    arrayList.add(  50);
    arrayList.add(  9);
    arrayList.add(  29);
    arrayList.add(  14);
    arrayList.add(  19);
    arrayList.add(  27);
    arrayList.add(  6);
    arrayList.add(  23);
    arrayList.add(  17);
    arrayList.add(  1);
    arrayList.add(  22);
    arrayList.add(  38);
    arrayList.add(  35);
    arrayList.add(  6);
    arrayList.add(  35);
    arrayList.add(  41);
    arrayList.add(  34);
    arrayList.add(  21);
    arrayList.add(  30);
    arrayList.add(  45);
    arrayList.add(  48);
    arrayList.add(  45);
    arrayList.add(  37);
    System.out.println(solve(arrayList,100));


  }

  public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
    ArrayList<Integer> al= new ArrayList();
    int sum=0;
    for(int i=0;i<A.size();i++){
      al.add(A.get(i));
      sum+=A.get(i);
      if(sum==B){
        return al;
      }
      while(sum>B){
        sum-=al.get(0);
        al.remove(0);
        if(sum==B)return al;
      }
    }
    al= new ArrayList();
    al.add(-1);
    return al;
  }
}
