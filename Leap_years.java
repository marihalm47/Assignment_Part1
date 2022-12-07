//Please write a java program to print the leap years between 2000 and 2100

package leap_year;

public class Leap_years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Check if the year is divisible by 4 but not 100, print "leap year"
		// Check if the year is divisible by 400, print "leap year"
	for (int i = 2000; i < 2100; i++) {
			
	        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
	        {
	            System.out.printf("%d\n", +i);
	        }
	        
	    }
		
		//int i;
		//System.out.printfprintln("%4d%n", i);
		

	}

}
