package arrays.sumpair_pattern;

/*Problem Description

Given a sorted array of integers (not necessarily distinct) A and an integer B,
 find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.

Since the number of such pairs can be very large, return number of such pairs modulo (10^9 + 7).
*/

import java.util.ArrayList;

public class PairsWithGivenSum {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(9);
        arrayList.add(9);
        System.out.println(solve(arrayList, 10));

    }

    public static int solve(ArrayList<Integer> A, int B) {

        int mod = (int) (Math.pow(10, 9) + 7);
        long count = 0;
        int i = 0;
        int j = A.size() - 1;
        while (i < j) {
            long sum = (long) A.get(i) + (long) A.get(j);
            if (sum < B) {
                i++;
            } else if (sum > B) {
                j--;
            } else if (sum == B) {
                int k = j;
                if (A.get(i).equals(A.get(k))) {
                    long n = k - i + 1;
                    count += n * (n - 1) / 2;
                    break;
                }
                while (k > i && A.get(i) + A.get(k) == B) {
                    count++;
                    k--;
                }
                i++;
            }

        }

        return (int) (count % mod);
    }

    //  ========================
    public static int solve1(ArrayList<Integer> A, int B) {

        //set two pointer to first and last
        //if sum greater than B decrement end pointer
        //if sum lesser than B increment intial pointer
        //if sum equals to B then increment count

        int count = 0;
        int i = 0;
        int j = A.size() - 1;
        while (i < j) {
            if (A.get(i) + A.get(j) < B) {
                i++;
            }
            if (A.get(i) + A.get(j) > B) {
                j--;
            }
            if (A.get(i) + A.get(j) == B) {
                if (A.get(i) == A.get(j)) {
                    int n = j - i + 1;
                    count = (n * (n - 1)) / 2;
                    return count;
                } else {
                    count++;
                    return count;
                }
            }

        }

        return count;
    }

    public static int solve2(ArrayList<Integer> A, int B) {

        //set two pointer to first and last
        //if sum greater than B decrement end pointer
        //if sum lesser than B increment intial pointer
        //if sum equals to B then increment count

        int mod = (int) (Math.pow(10, 9) + 7);
        int count = 0;
        int i = 0;
        int j = A.size() - 1;
        while (i < j) {
            //if sum lesser than B increment intial pointer
            if ((A.get(i) + A.get(j)) % mod < B) {
                i++;
            } //if sum greater than B decrement end pointer
            else if ((A.get(i) + A.get(j)) % mod > B) {
                j--;
            }
            //if sum equals to B then increment count
            else if ((A.get(i) + A.get(j)) % mod == B) {
                int k = j;
                while (A.get(i) + A.get(k) == B) {
                    count++;
                    k--;
                }
                i++;

            }

        }

        return count;
    }

    public static int solve3(ArrayList<Integer> A, int B) {

        //set two pointer to first and last
        //if sum greater than B decrement end pointer
        //if sum lesser than B increment intial pointer
        //if sum equals to B then increment count

        int mod = (int) (Math.pow(10, 9) + 7);
        int count = 0;
        int i = 0;
        int j = A.size() - 1;
        while (i < j) {
            if ((A.get(i) + A.get(j)) % mod < B) {
                i++;
            } else if ((A.get(i) + A.get(j)) % mod > B) {
                j--;
            } else if ((A.get(i) + A.get(j)) % mod == B) {
                int k = j;
                if (A.get(i).equals(A.get(k))) {
                    int n = k - i + 1;
                    count += (n * (n - 1)) / 2;
                    return count;
                } else {
                    while (k > i && (A.get(i) + A.get(j)) % mod == B) {
                        count++;
                        k--;

                    }


                }
                i++;

            }

        }

        return count;
    }


}
