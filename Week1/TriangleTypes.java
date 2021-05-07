import java.io.IOException;
import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double A=Math.max(a,Math.max(b,c));
        double B=0;
        double C=0;

        if (A==a){
            B=Math.max(b,c);
            C=Math.min(b,c);
        }
        if (A==b){
            B=Math.max(a,c);
            C=Math.min(a,c);
        }
        if (A==c){
            B=Math.max(b,a);
            C=Math.min(b,a);
        }

        if(A>=B+C){
            System.out.println("NAO FORMA TRIANGULO");
        }
        if(A*A==B*B+C*C){
            System.out.println("TRIANGULO RETANGULO");
        }
        if((A*A>B*B+C*C)!=(A>=B+C)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if((A*A<B*B+C*C)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(A==B && B==A && B==C){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if(((A==B) &&(A!=C)) || ((A==C) && (A!=B)) || ((B==C) &&(B!=A))){
            System.out.println("TRIANGULO ISOSCELES");
        }



    }

}
