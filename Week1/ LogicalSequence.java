import java.util.Scanner;

public class LogicalSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X= sc.nextInt();
        int Y = sc.nextInt();
        if (X > 1 && X < 20 && Y > X && Y < 10000) {
            for (int i = 1; i <= Y; i++) {
                System.out.print(i);
                if (i % X == 0){
                    System.out.println();}

                else {
                    System.out.print(" ");}
            }
        }
    }
}