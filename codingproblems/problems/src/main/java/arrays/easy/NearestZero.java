package arrays.easy;

public class NearestZero {
    public static void main(String[] args) {
        double[] ts =
                {-1,2,3};


        System.out.println( closestToZero(ts));;

    }

    static double closestToZero(double[] ts) {
        double min1= Integer.MIN_VALUE;
        double min2= Integer.MAX_VALUE;
        if(ts.length==0){
            return 0;
        }

        for(int i=0;i<ts.length;i++){
            if(ts[i]<0)
            {
                min1= Math.max(min1,ts[i]);
            }else
            {
                min2= Math.min(min2,ts[i]);
            }

        }
        if(Math.abs(min1)>=min2){

            return min2;
        }else{

            return min1;
        }


    }


}
