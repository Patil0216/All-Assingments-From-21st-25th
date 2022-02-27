package Java.Fundamentals;

import java.util.Scanner;

public class FEB22_Sum_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Entere Number ::");
		int Num = scan.nextInt(),sum=0;
		while(Num>0) {
			
		  sum=sum+Num;
			Num--; 
			 
		}
		System.out.println(sum);
		
	}

}
