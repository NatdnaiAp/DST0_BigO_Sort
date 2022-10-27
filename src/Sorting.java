import java.util.Arrays;
public class Sorting {
    public static int[] bubbleSort(int[] a){
        for(int j = 0;j<a.length;j++){
            for(int i = 0; i< a.length-j-1;i++){
                if(a[i] > a[i+1]){
                    int t = a[i];
                    a[i] = a[i+1];
                    a[i+1] = t;
                }
            }
        }
        return a;
    }
    public static int[] selectionSort(int [] a){
        for(int j = 0; j < a.length; j++){
            int last = a.length-j-1;
            int max_index = 0;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i <= last;i++){
                if(a[i] > max){
                    max = a[i];
                    max_index = i;
                }
            }
            int t = a[last];
            a[last] = max;
            a[max_index] = t;


        }
        return a ;
    }
    public static int[] insertionSort(int [] a){
        for(int i =0; i<a.length;i++){
            int temp = a[i];
            int j;
            for(j = i-1;j>=0;j--){
                if(temp > a[j]) break;
                a[j+1] = a[j];
            }
            a[j+1] = temp;

        }
        return a;

    }
    public static void main(String[] args){
        int n=10;
        int[] a = new int[n];
        for(int i =0; i<n;i++){
            a[i] = (int)(Math.random()*1000);}
            long x1,x2;
            x1 = System.nanoTime();
            System.out.println("Random number : "+Arrays.toString(a));
            bubbleSort(a);
            x2 = System.nanoTime();
            System.out.println("bublle Sort : "+Arrays.toString(a)+"time :"+(x2-x1));

        for(int i =0; i<n;i++){
            a[i] = (int)(Math.random()*1000);
        }

        x1 = System.nanoTime();
        System.out.println("Random number : "+Arrays.toString(a));
        selectionSort(a);
        x2 = System.nanoTime();
        System.out.println("selection Sort : "+Arrays.toString(a)+"time :"+(x2-x1));

        for(int i =0; i<n;i++){
            a[i] = (int)(Math.random()*1000);
        }

        x1 = System.nanoTime();
        System.out.println("Random number : "+Arrays.toString(a));
        insertionSort(a);
        x2 = System.nanoTime();
        System.out.println("insertion Sort : "+Arrays.toString(a)+"time :"+(x2-x1));

    }
}
