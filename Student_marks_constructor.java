
//Please write a java program to calculate sum & average  of given 4 marks via constructor, 
//if three or two marks only passed from main method, then keep the missing value(s) as 35)

package Student_marks;



public class Student_marks_constructor {

	private String name;
	private String course;
	private int[] marks;

	Student_marks_constructor (int marks1, int marks2, int marks3, int marks4) 
	{
	    // constructor which creates a student according to the specified parameters
	      
	      int sum=marks1+marks2+marks3+marks4;
	      int avg=sum/4;
	      System.out.println("Sum of marks:=" +sum);
	      System.out.println("avg of marks:=" +avg);
	    }

	public Student_marks_constructor(int marks1, int marks2, int marks3) {
		// TODO Auto-generated constructor stub
		
		 int marks4=35;  //keep missing value as 35
	      int sum=marks1+marks2+marks3+marks4;
	      int avg=sum/4;
	      System.out.println("Sum of marks:=" +sum);
	      System.out.println("avg of marks:=" +avg);
		
	}

	public Student_marks_constructor(int marks1, int marks2) {
		// TODO Auto-generated constructor stub
		int marks3=35;
		int marks4=35;
	      int sum=marks1+marks2+marks3;
	      int avg=sum/4;
	      System.out.println("Sum of marks:=" +sum);
	      System.out.println("avg of marks:=" +avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("parameterized constructor passing 4 values of Student marks :=");
	     System.out.println("---------------------");
		Student_marks_constructor s1= new Student_marks_constructor(10, 20, 30, 40);
		
		System.out.println("parameterized constructor passing 3 values of Student marks :=");
	     System.out.println("---------------------");
		Student_marks_constructor s2= new Student_marks_constructor(10, 20, 30);
		
		System.out.println("parameterized constructor passing 2 values of Student marks :=");
	     System.out.println("---------------------");
		Student_marks_constructor s3= new Student_marks_constructor(10, 20);
	
	}
		
		

	}
	
	


