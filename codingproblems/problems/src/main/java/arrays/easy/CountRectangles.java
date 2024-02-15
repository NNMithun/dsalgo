package arrays.easy;

public class CountRectangles {
    public static void main(String[] args) {
    int[] A={1,2,3,4};
    int B=8;
        System.out.println(countRectangles(A,B));
    }
    public static int solve(int[] A, int B) {
        int n=A.length;
        long rectangleCount=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j <n ; j++) {
                if(A[i]*A[j]<B){
                    rectangleCount=rectangleCount+2;
                    rectangleCount=rectangleCount%1000000007;
                }
                if (A[i]*A[j]>B){
                    n=j;
                }

            }
        }
        for (int i = 0; i < A.length; i++) {
            if(A[i]*A[i]<B){
                rectangleCount=rectangleCount+1;
                rectangleCount=rectangleCount%1000000007;
            }else {
                break;
            }
        }
        return (int)rectangleCount;
    }

    public static int countRectangles(int[] A, int B) {
        int n = A.length;
        long MOD = 1000000007;
        long count = 0;

        int left = 0, right = n - 1;

        while (left < n && right >= 0) {
            // Check if the area is less than B
            long area = (long) A[left] * A[right];
            if (area < B) {
                // Increment the count by the number of rectangles with the current configuration
                count = (count + left + 1) % MOD;
                left++;
            } else {
                // Decrement the right pointer to reduce the area
                right--;
            }
        }

        return (int)count;
    }
}
