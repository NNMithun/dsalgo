package arrays.easy;

import java.util.ArrayList;

public class StockBuySellIndices {
    public static void main(String[] args) {

    }
    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> buySellIndices= new ArrayList<>();
        int i=0;
        int j=0;
        int buyIndex=0;
        int sellIndex=0;

        while(i< A.length) {
            ArrayList<Integer> buySellPair= new ArrayList<>();
            //find local minima
            while (i < n - 1 && A[i] > A[i + 1]) {
                i++;
            }
            if (i==A.length-1){
                break;
            }
            buyIndex = i++;

            //local maxim
            while (i < A.length && A[i] > A[i - 1]) {
                i++;
            }
            sellIndex = i - 1;
            buySellPair.add(buyIndex);
            buySellPair.add(sellIndex);
            buySellIndices.add(buySellPair);

        }
        return buySellIndices;

    }
}
