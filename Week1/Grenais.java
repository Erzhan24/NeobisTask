import java.util.Scanner;

public class Grenais {
    public static void main(String args[]){
        int a,b,m=0,i=0,g=0,d=0, t=0;
        Scanner sc= new Scanner(System.in);
        while(true){
            a= sc.nextInt();
            b=sc.nextInt();
            System.out.printf("Novo grenal (1-sim 2-nao)\n");
            m++;
            if (a>b)
                i++;
            else if(a<b) g++;
            else d++;
            t=sc.nextInt();
            if(t==1)continue;
            else break;}

        System.out.printf("%d grenais\n", m);
        System.out.printf("Inter:%d\n",i);
        System.out.printf("Gremio:%d\n",g);
        System.out.printf("Empates:%d\n",d);


        if (i>g)
            System.out.printf("Inter venceu mais\n");
        else if (i<g)
            System.out.printf("Gremio venceu mais\n");
        else
            System.out.printf("Não houve vencedor\n");

    }
}

