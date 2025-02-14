// Kaden Jain
// Computer Programming 1 - Spring 2025
/* A program that asks the user to enter their
birth month (integer 1 – 12 inclusive). If the
user enters a value in range, the program echoes
the input ("Your birth month is: N") If the value
is not in the range it outputs an error msg ("You
entered an incorrect month value: N").  Here N should
be the value they entered.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // declare variables
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        // prompt for input
        System.out.println("Please enter you birth month as a number [1-12]: ");
        // error checking for int only
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();

            // determine if birth month 12 is in range if/else
            if (birthMonth >= 1 && birthMonth <= 12){

                System.out.println("Your birth month is: " + birthMonth);

                // determine what month it is if/else
                if (birthMonth == 1){
                    System.out.println("You were born in January!");
                }
                else if (birthMonth == 2){
                    System.out.println("You were born in February!");
                }
                else if (birthMonth == 3){
                    System.out.println("You were born in March!");
                }
                else if (birthMonth == 4){
                    System.out.println("You were born in April!");
                }
                else if (birthMonth == 5){
                    System.out.println("You were born in May!");
                }
                else if (birthMonth == 6){
                    System.out.println("You were born in June!");
                }
                else if (birthMonth == 7){
                    System.out.println("You were born in July!");
                }
                else if (birthMonth == 8){
                    System.out.println("You were born in August!");
                }
                else if (birthMonth == 9){
                    System.out.println("You were born in September!");
                }
                else if (birthMonth == 10){
                    System.out.println("You were born in October!");
                }
                else if (birthMonth == 11){
                    System.out.println("You were born in November!");
                }
                else {
                    System.out.println("You were born in December!");
                }

            }
            else {
                System.out.println("You entered an incorrect month value: " + birthMonth + ". Birth month must be in range [1-12].");
                System.out.println("Please run the program again");
            }

        }
        else {
            trash = in.nextLine();
            System.out.println("You entered the wrong input: " + trash);
            System.out.println("Birth month must be in range [1-12]");
            System.out.println("Please run the program again");
            System.exit( 0);
        }

    }
}