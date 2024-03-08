package inlamningsuppgift;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Inlamningsuppgift {

    public static String ask(String question) {
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        return scan.nextLine();
    }

    public void charToMorse() {
        Converter converter = new Converter();
        boolean keepgoing = true;

        while (keepgoing) { // Loopar metoden tills den får godkänd input
            String myEngChar = ask("Please write an english letter or a number between 0-9.");
            if (converter.getMorseCode(myEngChar) == null) { // Felhantering av input som inte finns i mapen
                System.out.println("Sorry, that didn't work. Please try again.");
            } else {
                System.out.println("Your input corresponds to " + converter.getMorseCode(myEngChar) + " in Morse code.");
                keepgoing = false; // Efter godkänd input sätts keepgoing till false för att avbryta loopen
            }
        }
    }

    public void morseToChar() {
        Converter converter = new Converter();
        boolean keepgoing = true;

        while (keepgoing) {
            String myMorseCode = ask("Please write some morse code.");
            if (converter.getEngChar(myMorseCode) == null) {
                System.out.println("Sorry, that didn't work. Please try again.");
            } else {
                System.out.println("Your morse code corresponds to " + converter.getEngChar(myMorseCode) +
                        " in the English alphabet.");
                keepgoing = false;
            }
        }
    }

    public void wordToMorse() {
        Converter converter = new Converter();
        boolean keepgoing = true;

        while (keepgoing) {
            String myEngWord = ask("Please write a word in English.");
            if (converter.getMorseWord(myEngWord) == null) {
                System.out.println("Sorry, that didn't work. Please try again.");
            } else {
                System.out.println("Your word corresponds to " + converter.getMorseWord(myEngWord ));
                keepgoing = false;
            }
        }
    }

    public void morseToWord() {
        Converter converter = new Converter();
        boolean keepgoing = true;

        while (keepgoing) {
            String myMorseWord = ask("Please write a word in Morse Code, separate code with ' '.");
            if (converter.getEngWord(myMorseWord) == null) {
                System.out.println("Sorry, that didn't work. Please try again.");
            } else {
                System.out.println("Your word corresponds to " + converter.getEngWord(myMorseWord) +".");
                keepgoing = false;
            }
        }
    }

    public static void main(String[] args) {
        try {
            Inlamningsuppgift uppgift = new Inlamningsuppgift();

            uppgift.charToMorse();
            uppgift.morseToChar();
            uppgift.wordToMorse();
            uppgift.morseToWord();

        } catch (NoSuchElementException e) { // Felhantering av input som signalerar att det inte kommer komma mer input
            System.out.println("Ooooppps, you broke it, bye bye!");
        }
    }
}