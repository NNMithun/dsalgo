package BitManipulation;

public class ReverseBitsLong {

  public static void main(String[] args) {
    System.out.println(reverse(3));
  }

  public static long reverse(long a) {
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

  private static long toggle(long a, int i) {
    long e = (long) Math.pow(2, i);
    a = a ^ e;
    e = (long) Math.pow(2, 31 - i);
    a = a ^ e;

    return a;

  }

  private static int isBitSet(long a, int i) {
    long e = (long) Math.pow(2, i);
    if ((a & e) > 0) {
      return 1;
    } else {
      return 0;
    }
  }
}
