package abstraction;

import java.util.Scanner;

public class Student_1 extends Teacher {
	
	@Override
	void Class_test()
	{
		System.out.println("Student_1");
		System.out.println("Do a program to make a multiply table of a number:");
	}

	void answer_sheet()
	{
		System.out.println("Answer: Time table");
		int n,m;
		Scanner input= new Scanner (System.in);
		System.out.println("Enter the value of n");
		n=input.nextInt();
		System.out.println("Enter the value of m");
		m=input.nextInt();
		for(int i= m;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
				
				System.out.println(i+"x"+j+"="+i*j);
			}
				
		}
		
		
	}
}
