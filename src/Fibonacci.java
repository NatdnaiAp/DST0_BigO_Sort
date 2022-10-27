import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n){
        if(n ==1 || n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("The sequence of Fibonacci of "+n+" number is :");
        for(int i =1; i<=n;i++){
            System.out.println(fibo(i)+"  ");
        }
        System.out.println("The "+n+"th(st) number in the fibonacci sequence is "+fibo(n));
    }
}
