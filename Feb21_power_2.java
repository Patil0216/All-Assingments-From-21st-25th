package Java.Fundamentals;
import java.util.Scanner;

public class Feb21_power_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number :: ");
		int num= scan.nextInt();
	 while(num>=2) {
		 num=num/2;
		 System.out.println(num);
	 }
	 if(num==1) {
		 System.out.println("True");
		 
	 }else {
		 System.out.println("False");
	 }
	} 

	}


