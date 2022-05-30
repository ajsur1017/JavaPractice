

public class Hello {
    public static void main(String[] args) {
        /* Make a shopping list
        * \n - newline
        * \t - tab
        * \b - backspace */

        System.out.print("SHOPPING LIST \n\t- Milk \n\t\t > Semi-skimmed \n\t\t > Medium \n\t - Eggs \n\t\t > Free-range \n\t - Bread");

        System.out.println("\nSHOPPING LIST");
        System.out.println("\t- Milk");
        System.out.println("\t\t> Semi-skimmed");
        System.out.println("\t\t> Medium");
        System.out.println("\t- Eggs");
        System.out.println("\t\t> Free-range");
        System.out.println("\t- Bread");

        System.out.print("The \n\t Cake \nIs \t\t\tA \n\tLie.\n");

        System.out.format("I have %.1f cats, %d dogs, and 1 %s.\n", 7.9, 2, "panther");

        double test = 4.5 -2.7;
        System.out.println(test);
        System.out.format("Once formatted it equals %.1f.",test);

    }
}