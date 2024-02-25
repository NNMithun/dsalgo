package dynamicprogramming;

public class ConsistentData {
    private static final int MOD = 1000000007;
    public static void main(String[] args) {

        System.out.println( Consistent(3));;
        System.out.println( countConsistentSubsequence(3));;


    }
    public static int Consistent(int N) {
        long result = 1;
        // Efficiently compute 2^N % MOD
        for (int i = 0; i < N; i++) {
            result = (result * 2) % MOD;
        }
        return (int)result;
    }
    public static int countConsistentSubsequence(int N) {
       long [] dp=  new long[N+1];
       dp[0]=1;
       dp[1]=2;
       for (int i=2;i<=N;i++){
           dp[i]=(dp[i-1]+dp[i-2])%MOD;
       }
       return (int) dp[N];
    }
}
