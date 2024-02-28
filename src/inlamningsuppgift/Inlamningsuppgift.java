package inlamningsuppgift;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Inlamningsuppgift {

    public static void main(String[] args) {
       /* try {
            Inlamningsuppgift uppgift = new Inlamningsuppgift();
            uppgift.run();
        }*/

        Converter converter = new Converter();
        boolean keepgoing = true;

        while (keepgoing) { // while tills man får godkänd input
            String myEngChar = ask("Please write an english letter or a number between 0-9.");
            if (converter.getMorseChar(myEngChar) == null) { // Felhantering
                System.out.println("Sorry, that didn't work. Please try again.");
            } else {
                System.out.println("Your input corresponds to " + converter.getMorseChar(myEngChar) + " in Morse code.");
                keepgoing = false;
            }
        }

        keepgoing = true;
        while (keepgoing) {
            String myMorseChar = ask("Please write some morse code.");
            if (converter.getEngChar(myMorseChar) == null) {
                System.out.println("Sorry, that didn't work. Please try again.");
            } else {
                System.out.println("Your morse code corresponds to " + converter.getEngChar(myMorseChar) + " in the english alphabet.");
                keepgoing = false;
            }
        }

        keepgoing = true;
        while (keepgoing) {
            String myEngWord = ask("Please write a word in english.");
           if (converter.getMorseWord(myEngWord) == null) {
                System.out.println("Sorry, that didn't work. Please try again.");
            } else {
                System.out.println("Your word corresponds to " + converter.getMorseWord(myEngWord));
                keepgoing = false;
            }
        }

        keepgoing = true;
        while (keepgoing) {
            try {
                String myMorseChar = ask("Please write some morse code again.");
                System.out.println("Your morse code corresponds to " + converter.getEngChar(myMorseChar) + " in the english alphabet.");
                keepgoing = false;
            } catch (NoSuchElementException e) { // Felhantering (ctrl D)
                System.out.println(e);
                System.out.println("Ooooppps, you broke it, bye bye!");
                break; // bryter efter felmeddelandet men det vill jag ju inte

            }
        }
    }

    public static String ask(String question) {
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        return scan.nextLine();
    }
}