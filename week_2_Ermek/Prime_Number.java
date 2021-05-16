import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            boolean status=true;
            for (int j = 2; j < X; j++) {
                if ((X % j) == 0) {
                    status=false;
                }
            }
            if (status) {
                System.out.print(X + " eh primo\n");
            } else {
                System.out.print(X + " nao eh primo\n");
            }
        }
    }
}