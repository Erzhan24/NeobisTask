import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {


        Scanner sc =new Scanner(System.in);
        int i;
        int PA;
        int PB;
        int T;
        int y;
        double G1,G2;
        T= sc.nextInt();
        for(i=0;i<T;i++) {
            y = 0;
            PA = sc.nextInt();
            PB = sc.nextInt();
            G1 = sc.nextDouble();
            G2 = sc.nextDouble();
            while (PA <= PB) {
                PA = (int) (PA + ((PA * G1) / 100));
                PB = (int) (PB + ((PB * G2) / 100));
                y++;
                if (y > 100){
                    System.out.printf("Mais de 1 seculo.\n");
                    break;}
            }


            if (y <= 100)
                System.out.printf("%d anos.\n", y);
        }
    }
}
