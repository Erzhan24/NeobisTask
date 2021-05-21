import java.util.Scanner;
public class Flavious{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int NC = in.nextInt();
        for(int i=0;i<NC;i++){
           int n= in.nextInt();
           int k=in.nextInt();
            int person = 0;
           for(int j=2;j<=n;j++){
               person = (person + k) % j;
           }
           System.out.print("Case "+(i+1)+": "+(person+1));
        }
    }
}