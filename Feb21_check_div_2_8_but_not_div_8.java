package Java.Fundamentals;

import java.util.Scanner;

public class Feb21_check_div_2_8_but_not_div_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number :: ");
		int num= scan.nextInt();
		boolean result=((num%2==0)&&(num%8==0)&&!(num%12==0));
		System.out.println(result);
	}

}
