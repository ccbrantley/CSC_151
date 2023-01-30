/*
 * Major Method Project
 *
 * You are taking over a project from a co-worker who has been fired for lying about being able to code Java.
 * You must now pick up from where he left off, luckily he was decent at commenting his code, just had a terrible attitude.
 *
 * Sample Run:
 * Here are the numbers in the array:
 *  21 41 25 89 36 80 57 64 91 75
 * Here are the numbers in the array reversed:
 *  75 91 64 57 80 36 89 25 41 21
 * Please give me an integer value and an insert point between 0 - 9
 * 2
 * 3
 *
 * Here are the numbers in the array final result:
 *  75 91 64 2 57 80 36 89 25 41
 */

import java.util.Scanner;
import java.util.ArrayList;

//append your last name to the class name, and saveAs the file as the same thing
class MethodProj {

    //insert the integer in the index position and move all elements right (the 9th index will fall off)
    public static void insertValue(int array[], int num, int index) {
        for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
        }
        array[index] = num;
    }

    //reverse the order of the elements
    public static void reverse(int rev[]){
        int temp = -1;
        for (int i = 0; i < rev.length / 2; i++) {
            temp = rev[i];
            rev[i] = rev[rev.length - 1 - i];
            rev[rev.length - 1 - i] = temp;

        }
    }

    //print the array
    public static void printit(int x[], String s){
        System.out.println("Here are the numbers in the array" + s + ":");
        for (int value : x) {
            System.out.println(value);
        }
    }

    //randomize() method will fill in elements with random numbers from 10 - 99
    public static void randomize(int x[]){
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)Math.floor(Math.random() * (99 - 10 + 1) + 10);
        }
    }

    /*you do not need to do anything to this main method,
      you need to make the methods above that they call work.*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] randomNums = new int [10];

        //populate with random numbers by calling the method
        randomize(randomNums);

        //display the random numbers by calling the method
        printit(randomNums, "");

        //reverse the array element order
        reverse(randomNums);

        //display the random numbers by calling the method
        printit(randomNums, " reversed");

        //ask for two integers; inserted number and insert index
        System.out.println("\nPlease give me an integer value and an insert point between 0 - 9");
        int num = scan.nextInt();
        int index = scan.nextInt();

        //insert the value in the index point by calling the method
        insertValue(randomNums, num, index);

        //display the final result
        printit(randomNums, " final result");
    }

}
