import java.util.Scanner;
public class Combiner{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=0;i<N;i++){
            String str1= in.next();
            String str2= in.next();
            String text="";
            String result="";
            int length=0;
            if(str1.length()>str2.length()){
                length=str2.length();
                text=str1;
            }
            else {length=str1.length(); text=str2;}
            for(int j=0;j<length;j++){
               result+=str1.charAt(j)+""+str2.charAt(j);
            }
            result+=text.substring(length);
            System.out.println(result);
        }
    }
}