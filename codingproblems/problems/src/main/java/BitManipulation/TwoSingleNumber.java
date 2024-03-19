package BitManipulation;

import java.util.ArrayList;

public class TwoSingleNumber {

  public static void main(String[] args) {
    ArrayList<Integer> b= new ArrayList<>();
    b.add(1);
    b.add(1);
    b.add(2);
    b.add(2);
    b.add(5);
    b.add(5);
    b.add(3);
    b.add(3);
    b.add(4);
    b.add(4);
    b.add(6);
    b.add(7);
    System.out.println(solve(b));
  }

  public static ArrayList<Integer> solve(ArrayList<Integer> A) {
    int ans = 0;
    int ans1 = 0;
    int ans2 = 0;
    ArrayList<Integer> b = new ArrayList<>();
    for (int i = 0; i < A.size(); i++) {
      ans ^= A.get(i);
    }
    int j = 0;

    while (j < 32) {
      if (((ans >> j)&1) == 1) {
        break;
      }
      j++;
    }

    for (int i = 0; i < A.size(); i++) {
      if (((A.get(i) >> j)&1) == 1) {
        ans1 ^= A.get(i);
      }
    }
    for (int i = 0; i < A.size(); i++) {
      if (((A.get(i) >> j)&1) == 0) {
        ans2 ^= A.get(i);
      }
    }

    if (ans1 < ans2) {
      b.add(ans1);
      b.add(ans2);
    } else {
      b.add(ans2);
      b.add(ans1);
    }

    return b;


  }

}
