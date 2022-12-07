//Please write a java program to print the day of the week when number is given (example : 1 means Sunday should be printed) 

package Days;

import java.util.Scanner;

public class Days_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a weekday number :");

	        int days = scanner.nextInt();

	        switch (days) {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
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
