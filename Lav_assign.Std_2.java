package abstraction;

import java.util.Scanner;

public class Student_2 extends Teacher {
	
	@Override
	void Class_test()
	{
		System.out.println("Student_2");
		System.out.println("Do a program to make a multiply table of a number:");
	}
	
	void answer_sheet()
	{
		System.out.println("Answer: Time table");
		int n1,m1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of m1");
		m1=input.nextInt();
		System.out.println("Enter the value of n1");
		n1=input.nextInt();
		for(int i= m1;i<=n1;i++)
		{
			for(int j=1;j<=10;j++)
			{
				
				System.out.println(i+"x"+j+"="+i*j);
			}
				
		}
		
		
	}
}
