package inlamningsuppgift;

import java.util.Arrays;
import java.util.HashMap;

public class Converter {

    HashMap<String, String> engToMorse = new HashMap<>();
    HashMap<String, String> morseToEng = new HashMap<>();

    public Converter() {
        engToMorse.put("a", ".-");
        engToMorse.put("b", "-...");
        engToMorse.put("c", "-.-.");
        engToMorse.put("d", "-..");
        engToMorse.put("e", ".");
        engToMorse.put("f", "..-.");
        engToMorse.put("g", "--.");
        engToMorse.put("h", "....");
        engToMorse.put("i", "..");
        engToMorse.put("j", ".---");
        engToMorse.put("k", "-.-");
        engToMorse.put("l", ".-..");
        engToMorse.put("m", "--");
        engToMorse.put("n", "-.");
        engToMorse.put("o", "---");
        engToMorse.put("p", ".--.");
        engToMorse.put("q", "--.-");
        engToMorse.put("r", ".-.");
        engToMorse.put("s", "...");
        engToMorse.put("t", "-");
        engToMorse.put("u", "..-");
        engToMorse.put("v", "...-");
        engToMorse.put("w", ".--");
        engToMorse.put("x", "-..-");
        engToMorse.put("y", "-.--");
        engToMorse.put("z", "--..");
        engToMorse.put("1", ".----");
        engToMorse.put("2", "..---");
        engToMorse.put("3", "...--");
        engToMorse.put("4", "....-");
        engToMorse.put("5", ".....");
        engToMorse.put("6", "-....");
        engToMorse.put("7", "--...");
        engToMorse.put("8", "---..");
        engToMorse.put("9", "----.");
        engToMorse.put("0", "-----");
        engToMorse.put(".", ".-.-.-");
        engToMorse.put(",", "--..--");
        engToMorse.put("?", "..--..");
        engToMorse.put("!", "-.-.--");


        for (String key : engToMorse.keySet()) {
            morseToEng.put(engToMorse.get(key), key);
        }
    }

    public String toLower(String myEngChar) {
        return myEngChar.toLowerCase();
    }

    public String getMorseChar(String myEngChar) {
        myEngChar = toLower(myEngChar); // Felhantering
        return engToMorse.get(myEngChar);
    }

    public String getEngChar(String myMorseChar) {
        return morseToEng.get(myMorseChar);
    }

    public String getMorseWord(String myEngWord) {

        //skapa en variabel att spara ordet i

        String morseWord = "";

        //ta in ett ord på engelska och splitta det
        String[] engChars = myEngWord.split("");

        //loopa igenom arrayen
        for (String engChar : engChars) {
            //hämta varje enskild char
            //kolla om char == "" i så fall skicka felmeddelande
            //ersätt bokstaven med morsekod och lägg till i morseWord
            //bygg ihop morsekoden till ett ord och särskilj bokstäverna med blanksteg


            if (getMorseChar(engChar) == null) {
                return null;
            } else {
                morseWord += getMorseChar(engChar) + " ";

            }
        }
        return morseWord;
    }
}



/*  public String getEngWord(String myMorseWord) {
        //skapa en variabel att spara ordet i
        //ta in ett ord på engelska och splitta det
        //loopa igenom ordet
        //1hämta varje enskild bokstav
        //2ersätt bokstaven med morsekod och lägg till i morseWord
        //3bygg ihop morsekoden till ett ord och särskilj bokstäverna med blanksteg
        //returnera variabeln

    }*/

/*
    public Converter() {
        morseToEng.put(".-", "a");
        morseToEng.put("-...", "b");
        morseToEng.put("-.-.", "c");
        morseToEng.put("-..", "d");
        morseToEng.put(".", "e");
        morseToEng.put("..-.", "f");
        morseToEng.put("--.", "g");
        morseToEng.put("....", "h");
        morseToEng.put("..", "i");
        morseToEng.put(".---", "j");
        morseToEng.put("-.-", "k");
        morseToEng.put(".-..", "l");
        morseToEng.put("--", "m");
        morseToEng.put("-.", "n");
        morseToEng.put("---", "o");
        morseToEng.put(".--.", "p");
        morseToEng.put("--.-", "q");
        morseToEng.put(".-.", "r");
        morseToEng.put("...", "s");
        morseToEng.put("-", "t");
        morseToEng.put("..-", "u");
        morseToEng.put("...-", "v");
        morseToEng.put(".--", "w");
        morseToEng.put("-..-", "x");
        morseToEng.put("-.--", "y");
        morseToEng.put("--..", "z");
        morseToEng.put(".----", "1");
        morseToEng.put("..---", "2");
        morseToEng.put("...--", "3");
        morseToEng.put("....-", "4");
        morseToEng.put(".....", "5");
        morseToEng.put("-....", "6");
        morseToEng.put("--...", "7");
        morseToEng.put("---..", "8");
        morseToEng.put("----.", "9");
        morseToEng.put("-----", "0");
        morseToEng.put(".-.-.-", ".");
        morseToEng.put("--..--", ",");
        morseToEng.put("..--..", "?");
        morseToEng.put("-.-.--", "1");
    }*/

