import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BanknotesAndCoins2 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.FRENCH);
        Locale.setDefault(Locale.Category.FORMAT, Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        float v= sc.nextFloat();
        int n=(int) v;
        int fn=((int)(v*100)%100);
        System.out.println("NOTAS:");
        System.out.println((n/100)+" nota(s) de R$ 100.00");
        n=n%100;
        System.out.println((n/50)+" nota(s) de R$ 50.00");
        n=n%50;
        System.out.println((n/20)+" nota(s) de R$ 20.00");
        n=n%20;
        System.out.println((n/10)+" nota(s) de R$ 10.00");
        n=n%10;
        System.out.println((n/5)+" nota(s) de R$ 5.00");
        n=n%5;
        System.out.println((n/2)+" nota(s) de R$ 2.00");
        n=n%2;
        System.out.println("MOEDAS:");
        System.out.println(n+" moeda(s) de R$ 1.00");
        System.out.println((fn/50)+" moeda(s) de R$ 0.50");
        fn=fn%50;
        System.out.println((fn/25)+" moeda(s) de R$ 0.25");
        fn=fn%25;
        System.out.println((fn/10)+" moeda(s) de R$ 0.10");
        fn=fn%10;
        System.out.println((fn/5)+" moeda(s) de R$ 0.05");
        fn=fn%5;
        System.out.println(fn+" moeda(s) de R$ 0.01");



    }
}
