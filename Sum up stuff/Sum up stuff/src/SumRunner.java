//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

public class SumRunner
{
	private static final String Sum = null;

	public static void main( String[] args )
	{	
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hello we are going to be calculating given numbers");
		System.out.println("The calculated numbers are ready. \n Do you wish to see the numbers? \n Yes \n No");
		
		String text = keyboard.nextLine();
		System.out.println("doesnt matter the answer, you're seeing it anyways \n");


		Sum test = new Sum();				
		test.setNums(12,15);
		test.sum();
		test.print();
		
		//add more test cases		
	}
}