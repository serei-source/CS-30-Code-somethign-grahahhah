import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Fahr {
    private int fahren;
    private int celsius;
    private Scanner keys;

    public int setFahrenheit()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("Please enter a temperature to convert into celsius. [FAHRENHEIT WISE]. ");
        fahren = keys.nextInt();
        System.out.println(1.8 * fahren + 32);
        return fahren;

    }

    public int celsiusConvert()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("Please enter a temperature to convert into Fahrenheit. [Celsius WISE]. ");
        celsius = keys.nextInt();
        System.out.println(0.56 * (celsius - 32));
        return celsiusConvert(); 

    }

}
