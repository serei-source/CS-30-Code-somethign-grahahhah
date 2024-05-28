import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Grocery {
    static String itemschosen;
    static int ShoppingList, ShopDiscontinue;
    static ArrayList<String> ListShopper = new ArrayList<String>();

    public static String PersonShopping()
    {
        ShoppingList = 0;
        for (int ShoppingList = 4; ShoppingList > 0; ShoppingList++)
        
        {
            Scanner keys = new Scanner(System.in);
            System.out.println("Hello, we've gone shopping today. What do you want to add?");
            itemschosen = keys.nextLine();
            ListShopper.add(itemschosen);
            System.out.println("Heres what you have so far: " + ListShopper);
            System.out.println("Continue shopping or stop for today? [1] NO [2] YES");
            ShopDiscontinue = keys.nextInt();
            if (ShopDiscontinue == 1){
                System.out.println("Your bag: " + ListShopper);
                System.out.println("Don't forget to pay.");
                break;
            }
            else;
        }
        return itemschosen;

    }

}


