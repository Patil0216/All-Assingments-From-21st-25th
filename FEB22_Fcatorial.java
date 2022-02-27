package Java.Fundamentals;

import java.util.Scanner;

public class FEB22_Fcatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Entere Number ::");
		int Num = scan.nextInt();
		int Fact = 1;

		do {

			Fact = Fact * Num;
			Num--;
		} while (Num > 0);
		{
			System.out.print(Fact);
		}

	}
}
