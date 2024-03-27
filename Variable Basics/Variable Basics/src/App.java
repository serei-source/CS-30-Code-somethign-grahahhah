public class App {
    public static void main(String[] args) throws Exception {
        double chickenCost = 12.99;
        double personMoney = 65.99;

        double purchaseChicken = (int) (personMoney / chickenCost);
        System.out.println("Your total purchase count for the chicken would be: " + purchaseChicken);

        double pizzasliceCost = 3.99;
        double personpurchaseMoney = 12.99;

        double pizzaPurchased = (int) (personpurchaseMoney / pizzasliceCost);
        System.out.println("Your total purchase count for pizza slice's would be: " + pizzaPurchased);
        System.out.println("Enjoy your meal!");
    }
}
