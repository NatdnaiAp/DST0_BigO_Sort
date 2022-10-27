public class FindMaximumSubsequenceSum {
    public static int mss1(int [] a ) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                if (sum > max) {
                    max = sum;

                }
            }
        }
        return max;
    }
    public static int mss2(int [] a ){
        int max = 0;
        for(int i = 0; i <a.length;i++){

                int sum = 0 ;
                for(int j=i; j<a.length;j++){
                    sum = sum+a[j];
                    if(sum > max) max = sum;
                }

        }return max;
    }
    public static int mss3(int [] a){
        int sum = 0 ;
        int max = 0;
        for(int i = 0; i < a.length; i++){
            sum = sum+a[i];
            if(sum < 0){
                sum = 0;
            }
            if(sum > max){
                max = sum;
            }
        }return max;
    }

    public static void main (String [] args){
        int n = 10000;
        int [] a = new int [n];
        for(int i = 0 ;i<n;i++){
            a[i] = (int)(Math.random()*n-n/2);

        }
        long x1,x2;
        x1 = System.currentTimeMillis();
        int m = mss1(a);
        x2 = System.currentTimeMillis();
        System.out.println("Maximum Subsequenc Sum : "+m+" Big O n^3 ="+(x2-x1)+"ms");


        x1 = System.currentTimeMillis();
         m = mss2(a);
        x2 = System.currentTimeMillis();
        System.out.println("Maximum Subsequenc Sum : "+m+" Big O n^3 ="+(x2-x1)+"ms");

        x1 = System.currentTimeMillis();
         m = mss3(a);
        x2 = System.currentTimeMillis();
        System.out.println("Maximum Subsequenc Sum : "+m+" Big O n^3 ="+(x2-x1)+"ms");
    }

}
