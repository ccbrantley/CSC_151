/*
 * If-Else If-Else
 
 * 1. Test if an integer input from the keyboard is odd or even; modulus is a great choice to use for this.
 * 
 *     Sample Run 1:
 *        Enter a Number:
 *        78
 *        Even
 * 
 *     Sample Run 2:
 *        Enter a Number:
 *        17
 *        Odd
 * 
 * 2. Ask the user to input the number of wheels. Based on their input, print out what type of vehicle it is.
 * Please include at least 3 vehicles and use a range of wheels using &&, and a choice of either set of wheels using ||
 * If they do not choose a number you have, give them a catch all answer using else.
 *    
 *    Sample Run 1: 
         Enter number of wheels:
         2
         Bike
         
      Sample Run 2:
         Enter number of wheels:
         18
         Tractor trailer
         
      Sample Run 3:
         Enter number of wheels:
         0 //not in the code selection
         Hoverboard
 */

import java.util.Scanner;
import java.lang.Math;

class IfElseIfElse {
    public static void main(String[] args) {
        //Code here

        //1
        System.out.println("\n\n1 *****************\n");

        // Create scanner and read in user input.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userInput = scanner.nextInt();

        // Output parity of user input.
        if (userInput % 2 == 0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }

        //2
        System.out.println("\n\n2 *****************\n");

        // Reading in first user input.
        System.out.print("Enter number of wheels: ");
        int numberWheels1 = scanner.nextInt();

        // Determining first user input vehicle type.
        String message1 = "";
        if (numberWheels1 == 1) {
            message1 = "Unicycle";
        }
        else if (numberWheels1 == 2) {
            message1 = "Bicycle";
        }
        else {
            message1 = "Hoverboard";
        }
        System.out.println(message1);
        System.out.println("\n");

        // Reading in second user input.
        System.out.print("Enter number of wheels: ");
        int numberWheels2 = scanner.nextInt();

        // Determining second user input vehicle type.
        String message2 = "";
        if (numberWheels2 == 1) {
            message2 = "Unicycle";
        }
        else if (numberWheels2 == 2) {
            message2 = "Bicycle";
        }
        else {
            message2 = "Hoverboard";
        }
        System.out.println(message2);
        System.out.println("\n");

        // Reading in third user input.
        System.out.print("Enter number of wheels: ");
        int numberWheels3 = scanner.nextInt();

        // Determining third user input vehicle type.
        String message3 = "";
        if (numberWheels3 == 1) {
            message3 = "Unicycle";
        }
        else if (numberWheels3 == 2) {
            message3 = "Bicycle";
        }
        else {
            message3 = "Hoverboard";
        }
        System.out.println(message3);
        System.out.println("\n");

    } //end of main
}
