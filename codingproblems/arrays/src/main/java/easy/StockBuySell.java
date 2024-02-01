package easy;

public class StockBuySell {
    public static void main(String[] args) {
        int price[] = {7, 5, 1, 3, 5, 7, 9, 1, 2};
        System.out.println(stockBuyAndSell(price.length, price));

    }

    public static int stockBuyAndSell(int n, int[] prices) {
        int i = 0;
        int j = 1;
        int buy = 0;
        int sell = 0;
        int profit = 0;

        while (i < n && j < n) {
            while (j < n && prices[i] > prices[j]) {
                i++;
                j++;
            }
            buy = prices[i];
            while (j < n - 1 && prices[j] < prices[j + 1]) {
                j++;
            }
            if (j < n) sell = prices[j];
            else sell = buy;

            profit += sell - buy;
            i = j + 1;
            j = j + 2;
        }

        return profit;

    }

    /*
    To solve this problem, we can use a simple approach that involves iterating through the array and looking for opportunities to buy low and sell high. The key insight is that the maximum profit can be obtained by summing up all the increases in the stock prices over the period, which effectively means buying the stock at each local minimum and selling it at each subsequent local maximum.
      Here's a Java program to implement this solution:
    * */
    public static int stockBuyAndSell_chatgpt(int n, int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int maxProfit = 0;

        // Iterate through the array, summing up profitable transactions
        for (int i = 1; i < prices.length; i++) {
            // If the price of the stock has increased, add the difference to the profit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
}
