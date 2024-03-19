package BitManipulation;

public class ReverseBitsInt {

  public static void main(String[] args) {

  }

  public int reverse(int a) {
    int b;
    int c;

    for (int i = 0; i < 16; i++) {
      b = isBitSet(a, i);
      c = isBitSet(a, 31 - i);

      if (b != c) {
        a = toggle(a, i);
      }
    }
    return a;

  }

  private int toggle(int a, int i) {
    int e = (int) Math.pow(2, i);
    a = a ^ e;
    e = (int) Math.pow(2, 31 - i);
    a = a ^ e;

    return a;

  }

  private int isBitSet(int a, int i) {
    int e = (int) Math.pow(2, i);
    if ((a & e) == 1) {
      return 1;
    } else {
      return 0;
    }
  }
}
