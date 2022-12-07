//Please write a java program to print the binary, octal, hexadecimal form of a given decimal number
//(example : for the input 10, print 1010(binary), 12 (octal), A (hexa))


package Convert_number;

import java.util.Scanner;

public class Number_operations {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Convert con = new Convert();
        con.getValue();
        con.convert();

	}
	
	
}
class Convert
{
    Scanner scan;
    int num;
   public void getValue()
     {
          System.out.println("Decimal to HexaDecimal,Octal and Binary");
          Scanner input = new Scanner(System.in);
        
          System.out.println("\nEnter the number :");
          num = Integer.parseInt(input.nextLine());
     }
   public void convert()
      {
	   //calculating hexadecimal value
           String hexa = Integer.toHexString(num);
           System.out.println("HexaDecimal Value is : " + hexa);
           
           //calculating octal value
           String octal = Integer.toOctalString(num);
           System.out.println("Octal Value is : " + octal);
           
           //calculating in binary form
           String binary = Integer.toBinaryString(num);
           System.out.println("Binary Value is : " + binary);
       }
}
