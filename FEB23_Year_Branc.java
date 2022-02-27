package Java.Fundamentals;

import java.util.Scanner;

public class FEB23_Year_Branch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Year :: ");
		int Year = scan.nextInt();
		System.out.println("Enter Branch :: ");
		String Branch = scan.next();
		switch (Year) {
		case 1:
			System.out.println("Same Subject For All Branches in first yera");
			break;
		case 2:
		case 3:
		case 4:
			switch (Branch) {
			case "CS":
			case "IT":
				System.out.println("Opeted for Computer branch");
				break;
			case "EE":
			case "ECE":
				System.out.println("Opeted for Electrical branch");
				break;
			case "Mechanical":
				System.out.println("Opeted for Mechanical branch");
				break;
			

			}
		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}
