import java.util.Scanner;
public class Caesar_Cipher{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
           String text=in.next();
           int T= in.nextInt();
           char cipher[]=text.toCharArray();

           for (int j=0;j<cipher.length;j++){
               char c = cipher[j];
               if (c >= 65 && c <= 90)
               {
                   int x = c - 65;
                   x = (x - T) % 26;
                   if (x < 0)
                       x += 26;
                   cipher[j] = (char) (x + 65);
               }
           }
            System.out.println(cipher);
        }
    }
}