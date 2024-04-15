import java.util.Scanner;

public class bigorsmallrunner {
    public static void main(String[] args) throws Exception {
        Scanner keynum = new Scanner(System.in);
        Scanner keynum2 = new Scanner(System.in);

        System.out.print("Please input your numbers. ");
        int num1 = keynum.nextInt();
        System.out.print("Second Number: ");
        int num2 = keynum2.nextInt();

        if (num1 < num2){
            System.out.print("Small.");
        }
        else if (num2 > num1){
            System.out.print("Bigger.");
            }
            else{
                if (num1 == num2){
                    System.out.print("EQUALITY");
                }
            }
        }
    }
