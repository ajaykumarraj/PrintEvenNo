package newcompany;
import java.util.Scanner;

public class TestPrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number of chaking prime or not");
		int num = 23;
		int i=2;
		while(i<num) {
			if(num%i==0) {
				System.out.println(num+" is not a prime no.");
				break;
			}
			i++;
		}
		if(num==i) {
			System.out.println(num+" is a prime no.");
		}
		
	}

}
