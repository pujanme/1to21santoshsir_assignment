package assignment_18;

import java.util.Scanner;

public class assinment_18 {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
				
sc.close();
		System.out.println("Enter the first number :");
		int number1 = sc.nextInt();

		

		System.out.println("Enter the second number :");
		int number2 = sc.nextInt();

		

		System.out.println("Enter the third number :");
		int number3 = sc.nextInt();
		
		
		
		if (number1>number2 && number1 >number3) {
			System.out.println(" First number is the higest or largest! ");}
			
			
			else if  (number2>number3 && number2 >number1) {
				System.out.println(" Second number is the higest or largest! ");
			}else			
			{	
				System.out.println(" Third number is the higest or largest! ");
		
		
			
	}

	}
}