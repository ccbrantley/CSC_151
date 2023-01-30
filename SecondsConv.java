/*
 * Seconds Conversion
 *
 * Write a method that accepts a number of seconds and prints the
 * correct number of hours, minutes and seconds.
 *
 * This method must be called realTime() and its parameter must be an integer.
 *
 * Calling realTime(6342) would print the following:
 *
 *      Hours: 1
 *      Minutes: 45
 *      Seconds: 42
 */

import java.util.Scanner;

class SecondsConv {

    //fill in the rest of the method declaration realTime( ) with an algorithm that will convert passed seconds to the sample output above
    public static void realTime(int secs) {
        System.out.println("Hours: " + ((secs - secs % 60) / 3600));
        System.out.println("Minutes: " + ((secs - secs % 60) / 60) % 60);
        System.out.println("Seconds: " + (secs % 60));
    }

    //accept the number of seconds from a user and pass that data to the realTime method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = scan.nextInt();
        realTime(seconds);
    }

}
