public class Sequence {
    public static void main(String args[]) {
        int a=0;
        for(float i=0; i<=2.0f; i=i+0.2f){
            for(int j=1; j<=3; j++)
                if(a%5==0)
                    System.out.printf("I=%.0f J=%.0f%n",i,j+i);
                else
                    System.out.printf("I=%.1f J=%.1f%n",i,j+i);
            a++;
        }
    }
}