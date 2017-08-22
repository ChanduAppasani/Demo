package Lab1;
import java.util.Scanner;

public class assignment1 {
	public static void main(String[] args){
		//System.out.println("HELLO BUDDY!!");
		int a[][]=new int[4][3];
		/*a[0][0]=100;
		a[0][1]=0;
		a[0][2]=1;*/
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				System.out.println("Enter"+i+1+" "+j+1+"element");
				a[i][j]=s.nextInt();
			}
		}
		int  m=10,n=90;
		double d[]=new double[4];
		for (int i=0;i<4;i++){
			int p=a[i][1]-m,q=a[i][2]-n;
			int r=p^2+q^2;
			d[i] = Math.sqrt(r);
			
			
		}
		
		
	}

}
