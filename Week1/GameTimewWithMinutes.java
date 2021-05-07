import java.io.IOException;
import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();
        if(d<b){
            d+=60;
            c-=1;
            d-=b;
            if (c<a){
                c+=24;
                c-=a;
            }
            else{
                c-=a;
            }

            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",c,d);}
        else if (a==c && b==d){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else if(d>b){
            d-=b;
            if(c<a){
                c+=24;
                c-=a;
            }
            else{
                c-=a;
            }

            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",c,d);}

    }
}
