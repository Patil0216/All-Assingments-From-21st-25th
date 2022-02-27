package Java.Fundamentals;

import java.util.Scanner;

public class FEB25_Half_daimond_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enere Number :: ");
		int n= scan.nextInt();
		
		for(int i=1; i<n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		
		}
		for(int i=1; i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		
		}

	}

}
