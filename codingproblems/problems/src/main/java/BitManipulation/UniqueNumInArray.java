package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumInArray {

  public static void main(String[] args) {

    ArrayList<Integer> b= new ArrayList<>();
    b.add(1);
    b.add(1);
    b.add(2);
    b.add(2);
    b.add(3);
    System.out.println(singleNumber(b));
  }
  public static int singleNumber(final List<Integer> A) {
    int ans=0;
    for (int i=0;i<A.size();i++){
      ans^=A.get(i);
    }

    return ans;
  }
}
