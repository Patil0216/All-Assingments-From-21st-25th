package Java.Fundamentals;
import java.util.Scanner;

public class FEB25_Inverted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int n = scan.nextInt();
		int s=0;
		
		 for(int i = n-1; i>= 0; i--)
	        {
	            for(int j = n-1;j>s;j--)
	                System.out.print(" ");
	            System.out.print("* ");
	            for(int k=1;k<(s*2);k++)
	                System.out.print(" ");
	            if(i<n-1)
	                System.out.print("*");
	            s++;
	            System.out.println();
	        }

	}

}
