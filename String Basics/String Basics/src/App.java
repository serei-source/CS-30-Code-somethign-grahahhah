public class App {
    public static void main(String[] args)
    {
        String message1 = "I am very Happy!";
        String target1 = "very ";

        String message2 = "That was so funny lmao - lol";
        String target2 = "laught out loud";

        System.out.println(message1.length());
        System.out.println(message1.substring(0,5) + target1 + message1.substring(10, 15));
        System.out.println(message2.length());
        System.out.println(message2.substring(0,25)+ target2 + message2.substring(25, 25));
    }
}
