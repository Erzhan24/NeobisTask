import java.io.IOException;
import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) throws IOException {

        int[] m = new int []{100,50,20,10,5,2,1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int _100 = 0;
        int _50 = 0;
        int _20 = 0;
        int _10 = 0;
        int _5 = 0;
        int _2 = 0;
        int _1 = 0;
        int overall=0;

        while(true){
            if(n>=overall+m[0]){
                _100++;
                overall+=m[0];
            }
            else if(n>=overall+m[1]){
                _50++;
                overall+=m[1];
            }
            else if(n>=overall+m[2]){
                _20++;
                overall+=m[2];
            }
            else if(n>=overall+m[3]){
                _10++;
                overall+=m[3];
            }
            else if(n>=overall+m[4]){
                _5++;
                overall+=m[4];
            }
            else if(n>=overall+m[5]){
                _2++;
                overall+=m[5];
            }
            else if(n>=overall+m[6]){
                _1++;
                overall+=m[6];}
            else {
                break;
            }

        }

        System.out.println(n);
        System.out.println(_100+" nota(s) de R$ 100,00");
        System.out.println(_50+" nota(s) de R$ 50,00");
        System.out.println(_20+" nota(s) de R$ 20,00");
        System.out.println(_10+" nota(s) de R$ 10,00");
        System.out.println(_5+" nota(s) de R$ 5,00");
        System.out.println(_2+" nota(s) de R$ 2,00");
        System.out.println(_1+" nota(s) de R$ 1,00");


    }
}