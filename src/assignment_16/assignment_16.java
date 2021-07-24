package assignment_16;

import java.util.Scanner;

public class assignment_16 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int number,reminder;
		
		System.out.println(" Enter an Integer Number :");
		number = scan.nextInt(); 
		scan.close();
		
		reminder= number % 2;
		
		if (reminder == 0)
			System.out.println(number+" is an Even Number!");
		else
			System.out.println(number+" is an Odd Number!");
	}

}
