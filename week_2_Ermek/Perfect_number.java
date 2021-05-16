import java.util.Scanner;
public class Perfect_number{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int sum = 0;
            int X = in.nextInt();
            for (int j = 1; j <= X / 2; j++) {
                if ((X % j) == 0) {
                    sum += j;
                }
            }
            if (sum == X) {
                System.out.print(X + " eh perfeito\n");
            } else {
                System.out.print(X + " nao eh perfeito\n");
            }
        }
    }
}