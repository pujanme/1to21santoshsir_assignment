package assignment_21;

import java.util.Scanner;

public class assignment_21 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		

		System.out.println("Enter day");
		int day = obj.nextInt();
switch(day) {

case 1:

	System.out.println("Monday");
break;
		
case 2:	
	System.out.println("Tuesday");
	
case 3:

	System.out.println("Wednesday");
break;
		
case 4:	
	System.out.println("Thrusday");
	
case 5:

	System.out.println("Friday");
break;
		
case 6:	
	System.out.println("Saturday");
	break;
	
case 7:
	System.out.println("Sunday");
break;

default:
	System.out.println("Invalid");
	break;
	}
	}

}
