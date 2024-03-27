import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner umer = new Scanner(System.in);
        // System.out.println("Scanner Demo Inputs");
        // // Int Input

        // System.out.println("Intergers: ");
        // int num = keys.nextInt();
        // System.out.println("Number chosen is: " + umer);

        Scanner keys = new Scanner(System.in);
        Scanner sentence2 = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = keys.nextInt();
        System.out.print("Enter a Sentence: ");
        String sentence = sentence2.nextLine();
        System.out.println(num + " " + sentence);



    }
}
