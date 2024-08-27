import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Miles to Feet");
        System.out.println("8. Feet to Miles");
        System.out.println("9. Years to Generations");
        System.out.println("10. Generations to Years");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Farenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = fahrenheit * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees farenheit is " + celsius + " degrees celsius");
        }
        if (selection == 3)
        {
            System.out.println("Enter feet: ");
            double Var1 = keyboard.nextDouble();
            keyboard.nextLine();
            double Var2 = Var1 * .3048;
            System.out.println(Var1 + "ft is " + Var2 + "m");
        }
        if (selection == 4)
        {
            System.out.println("Enter meters: ");
            double Var1 = keyboard.nextDouble();
            keyboard.nextLine();
            double Var2 = Var1 * 3.28084;
            System.out.println(Var1 + "m is " + Var2 + "ft");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double Var1 = keyboard.nextDouble();
            keyboard.nextLine();
            double Var2 = Var1 * 29.574;
            System.out.println(Var1 + " ounces is " + Var2 + "mL");
        }
        if (selection == 6)
        {
            System.out.println("Enter Milliliters: ");
            double Var1 = keyboard.nextDouble();
            keyboard.nextLine();
            double Var2 = Var1/29.574;
            System.out.println(Var1 + "mL is " + Var2 + " ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter Miles: ");
            double Var1 = keyboard.nextDouble();
            keyboard.nextLine();
            double Var2 = Var1 * 5280;
            System.out.println(Var1 + " miles is " + Var2 + "ft");
        }
        if (selection == 8)
        {
            System.out.println("Enter feet: ");
            double Var1 = keyboard.nextDouble();
            keyboard.nextLine();
            double Var2 = Var1/5280;
            System.out.println(Var1 + "ft is " + Var2 + " miles");
        }
        if (selection == 9)
        {
            System.out.println("Enter Years: ");
            double Var1 = keyboard.nextDouble();
            keyboard.nextLine();
            double Var2 = Var1 * 3/100;
            System.out.println(Var1 + " years is " + Var2 + " generations");
        }
        if (selection == 10)
        {
            System.out.println("Enter Generations: ");
            double Var1 = keyboard.nextDouble();
            keyboard.nextLine();
            double Var2 = Var1 * 100/3;
            System.out.println(Var1 + " generations is " + Var2 + " years");
        }
    }
}
