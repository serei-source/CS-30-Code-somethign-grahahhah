import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle
{
	int sideA, sideB, sideC, perimeter;
	double theArea, sideP;

	public Triangle(){

	}
	
	
	public int selectchoice()
	{
		Scanner keys = new Scanner(System.in);
		System.out.println("Would you like to calculate the final result of the triangle? [1]");
		int selectchoice = keys.nextInt();

		return selectchoice;
	}


	{
		Scanner keys = new Scanner(System.in);
		System.out.println("Choose side 1. ");
		sideA = keys.nextInt();
		System.out.println("Choose side 2. ");
		sideB = keys.nextInt();
		System.out.println("Choose side 3. ");
		sideC = keys.nextInt();

	}

	public void areatrianglemath( )
	{
		perimeter = sideA + sideB + sideC;
		System.out.println("The perimeter is: " + perimeter);
		
		sideP = perimeter / 2.0;
		System.out.println("The side of P is: " + sideP);

		theArea = sideP * (sideP - sideA) * (sideP - sideB) * (sideP - sideC);
		theArea = Math.sqrt(theArea);
	


		System.out.println("Lastly, the area is: " + theArea);


	}
}