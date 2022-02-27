package Java.Fundamentals;

import java.util.Scanner;

public class FEB22_Factorial_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Entere Number ::");
		int Num = scan.nextInt();
		int Fact = 1;
		while (Num > 0) {
			Fact = Fact * Num;
			Num--;
		}
		System.out.println(Fact);

	}

}
