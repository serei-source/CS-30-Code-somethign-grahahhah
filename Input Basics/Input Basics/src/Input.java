import java.util.Scanner;

public class Input

{

  public static void main (String[] args)

  {

      Scanner keyboard = new Scanner(System.in);

      int intOne, intTwo; 
      int doubleOne, doubleTwo;

      System.out.print("Enter an integer :: ");

      intOne = keyboard.nextInt();

 

      System.out.print("Enter another integer :: ");

      intTwo = keyboard.nextInt();

      System.out.print("Enter a double :: ");

      doubleOne = keyboard.nextInt();

      System.out.print("Enter another double :: ");

      doubleTwo = keyboard.nextInt();
      

      System.out.println("integer one = " + intOne);

      System.out.println("integer two = " + intTwo);

      System.out.println("Double one = " + doubleOne);

      System.out.println("Double two = " + doubleTwo);

      int sum = intOne + intTwo;

      double sum2 = doubleOne + doubleTwo;
      System.out.println("Result 1: " + sum);
      System.out.println("Result 2: " + sum2);

   }

}

 