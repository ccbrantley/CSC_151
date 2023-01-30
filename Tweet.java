/*
 * Tweet Count
 *
 * You are to write a program that prompts and accepts a tweet from someone of 140 characters or less.
 * You will print if the length was correct, number of hashtags (#), number of attributions (@),
 * number of web links (http://).
 *
 * If the tweet was over 140 characters, you will need to print how much over 140 it was.
 *
 * Sample Run 1:
 *
 * Please enter a tweet:
 * @kewlfrogz says #holla http://dubdubdub.dubya.com
 * Length Correct
 * Number of Hashtags: 1
 * Number of Attributions: 1
 * Number of Links: 1
 *
 * Sample Run 2:
 *
 * Please enter a tweet:
 * @whgates #Xbox stomps all over #Playstation - like #PizzaHut wings beasts #PapaJohns wings, but #PCgaming is Godzilla! WHO DA MASTA!? http://www.pcgamingrulezall.com
 * Excess Characters: 25
 */

import java.io.*;
import java.util.Scanner;

class Tweet {
    public static void main(String args[]) {
        final int MAX_CHARACTERS = 140;
        System.out.print("Please enter a tweet: ");
        Scanner scanner = new Scanner(System.in);
        String tweet = scanner.nextLine();
        String message = "";
        if (tweet.length() < MAX_CHARACTERS) {
            int hashCount = 0;
            int attributionCount = 0;
            int linkCount = 0;
            for (int i = 0; i < tweet.length(); i++) {
                if (tweet.charAt(i) == '#') {
                    ++hashCount;
                }
                else if (tweet.charAt(i) == '@') {
                    ++attributionCount;
                }
                else if (tweet.charAt(i) == ':') {
                    if (i - 4 > 0 && i + 2 < tweet.length()) {
                        if (tweet.substring(i - 4, i + 3).equals("http://")) {
                            ++linkCount;
                        }
                    }
                }
            }
            message = "Length Correct\n" + "Number of hashtags: " + hashCount + "\n";
            message += "Number of Attributions: " + attributionCount + "\n";
            message += "Number of links: " + linkCount + "\n";
        }
        else {
            message = "Excess Characters: " + (tweet.length() - MAX_CHARACTERS);
        }
        System.out.println(message);
    }
}
