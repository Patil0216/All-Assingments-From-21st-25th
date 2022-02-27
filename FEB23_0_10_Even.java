package Java.Fundamentals;

import java.util.Scanner;

public class FEB23_0_10_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number :: ");
		int n=scan.nextInt();
		if(n<=10) 
		{
			if(n%2==0) {
				System.out.println(n);
				
			}else
			{
			System.out.println("Invalid Input");
			}
			
		} 
		
	}

}
