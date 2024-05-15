import java.util.Scanner;

public class Numbercooler{

public static boolean coolestofnumber( int num )
{
    boolean coolnumbreturn;

    Scanner keys = new Scanner(System.in);
    System.out.println("Enter a number. It will determine if it is a cool number or not. ");
    int usernumber = keys.nextInt();
    while (usernumber > 0){
        if (usernumber % 3 ==1 && usernumber % 4 ==1 && usernumber % 5 ==1 && usernumber % 6 ==1){
            System.out.println("This is a cool number!" + usernumber);
            usernumber--;
        }
        else{
            System.out.println("This isnt a cool number noob" +num);
            usernumber--;
        }
    }
    return true;
    
}

public static int coolcountnumber(int num)

{
    return 0;

}
}