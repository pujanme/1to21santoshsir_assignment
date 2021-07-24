package assinment_17;

import java.util.Scanner;

public class assinment_17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.println("Enter year :");
		year = sc.nextInt(); 
		sc.close();
		

if (year%4 == 0 && year % 100 != 0) {
System.out.println(year + " is a leap year: ");



} else if  (year % 400 == 0) {
	System.out.println(year + " is a leap year: ");

}else 
	System.out.println(year + " is a leap year: ");


		
	}
	}

