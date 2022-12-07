
package factors_of_numbers;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//int num=60;
		int count=0;

		System.out.println("Enter Number for Factor");
		int num=input.nextInt();
		System.out.print("Factors of " + num + " are: ");
		for (int i = 1; i <= num; ++i) 
		{
			// if number is divided by i
		      // i is the factor
		      if (num % i == 0) {
		        System.out.print(i + " ");
		       // i=i++;
		        //System.out.println("Total Number of Factor are:" +i);
		        		        count=count+1;
		      }
		     
		    
		    }
		System.out.println("\n");
		System.out.println("Total Number of Factor are:" +count);
		

	}

}
