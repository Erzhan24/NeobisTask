import java.util.Scanner;
public class WeightedAverages {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        float b;
        float c;
        float d;
        float s;

        for( int i=0;i<a;i++){
            b= sc.nextFloat();
            c= sc.nextFloat();
            d= sc.nextFloat();

            s=((b/10)*2) + ((c/10)*3) + ((d/10)*5);
            System.out.printf("%.1f\n",s);

        }

    }
}
