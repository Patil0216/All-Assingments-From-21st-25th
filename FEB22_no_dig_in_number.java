package Java.Fundamentals;
import java.util.Scanner;
public class FEB22_no_dig_in_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Entere Number ::");
		int Num=scan.nextInt();
		int count=0;
		while(Num>count) {
		Num=Num/10;
				count++;
		}
		System.out.println(count);
	}

}
