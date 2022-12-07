package Fabonice;

import java.util.Scanner;

public class Fabonice_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
	    int num2 = 1;
	    System.out.println("Enter the Nth value");
	    
	    Scanner input = new Scanner(System.in);
	    int no = input.nextInt();
	    
	    System.out.println("The fibbonaci series");
	    System.out.println(num1);
	    System.out.println(num2);

	    for (int i=0 ; i<no; i++)
	      {
	        int num3;
	        num3 = num1 + num2;
	        System.out.println(num3);
	        num1=num2;
	        num2=num3;
	        
	        
	      }
	}

}
