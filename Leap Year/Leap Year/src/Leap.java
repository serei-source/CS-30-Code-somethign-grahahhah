import java.util.Scanner;
import java.lang.Math.*;

public class Leap {
    int yearselected;

    public void year(){

    }
    public void leapyearchoice()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("Please put a year number.");
        yearselected = keys.nextInt();

    }

    public void leapyearmath()
    {
        if (yearselected % 400 == 0){
            System.out.println("Correct, this is a leap year.");
        }
        else if(yearselected % 4 == 0 && yearselected % 100 != 0){
            System.out.println("Correct! That is also a leap year.");

        }
        else{
            System.out.println("Incorrect, this is not a leap year.");
        }

        }
}
