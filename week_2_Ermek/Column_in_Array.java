import java.util.Scanner;
class Column{
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
	int C=in.nextInt();
	char T=in.next().toUpperCase().charAt(0);
	double [][] M=new double [12][12];
	  for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M.length; j++) {
        		M[i][j] = in.nextDouble();
        	}
        }
	if(T == 'S'){
	double sum=0;
          for(int j = 0; j < M.length; j++) {
    		sum += M[j][C];
    	}
	System.out.println(String.format("%.1f", sum));}

	if(T == 'M'){
	double avg=0;
	   for(int j = 0; j < M.length; j++) {
    		avg+= M[j][C];
    	}
	avg /=12;
	System.out.println(String.format("%.1f", avg));}
	}
}