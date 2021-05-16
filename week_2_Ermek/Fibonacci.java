import java.util.Scanner;
public class Fibonacci{
    static long getFibonacci(long n) {
        if (n == 0 || n == 1) return n;
        long fnMin2 = 0;
        long fnMin1 = 1;
        long sum = 0;
        for(int i = 2; i <= n; i++) {
            sum = fnMin1 + fnMin2;
            fnMin2 = fnMin1;
            fnMin1 = sum;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        long N[]=new long[T];
        for(int i=0;i<T;i++)
         N[i]= in.nextInt();
        for(int i=0;i<T;i++)
        System.out.println("Fib("+N[i]+") = "+getFibonacci(N[i]));
    }
}
