import java.util.Scanner;

public class Geometry {
    private int formula, length, width, side, radius;

    // Perimeter of a rectangle
    public void rectangle() {
        Scanner keys = new Scanner(System.in);
        System.out.println("Please choose your # for the [Length]. ");
        length = keys.nextInt();
        System.out.println("Second, [Width]. ");
        width = keys.nextInt();
        System.out.println("Your built answer is... "+ (2 * (width + length)));
    }

    // Surface area of a cube
    public void cube() {
        Scanner keys = new Scanner(System.in);
        System.out.println("Please choose your # for the [Side]. ");
        side = keys.nextInt();
        System.out.println("Your built answer is... " + (6 * (side * side)));
    }

    // Area of a circle
    public void circle() {

        Scanner keys = new Scanner(System.in);
        System.out.println("Please choose your # for the [Radius]. ");
        radius = keys.nextInt();
        System.out.println("Your built answer is... " + (3.14 * (radius * radius)));

    }
    public int choiceselcted()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("Would you like to calculate: \n Rectangle [1] \n Circle [2] \n Cube [3]");
        int choiceselcted = keys.nextInt();

        return choiceselcted;
    }
}
