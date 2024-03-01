package inlamningsuppgift;

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


        for (String key : engToMorse.keySet()) { // loppar igenom alla nycklar
            morseToEng.put(engToMorse.get(key), key); // nyckel och värde byter plats
        }
    }

   public String toLower(String myEngChar) { // byter ut versal mot motsvarande gemen
        return myEngChar.toLowerCase(); // returnerar värdet
    }

    public String getMorseCode(String myEngChar) {
        myEngChar = toLower(myEngChar); // Felhantering ifall användaren använt versaler
        return engToMorse.get(myEngChar); // anropar mapen på det engelska tecknet användaren angett
        // och returnerar värdet
    }

    public String getEngChar(String myMorseCode) {
        return morseToEng.get(myMorseCode);
    }

    public String getMorseWord(String myEngWord) {

        //skapa en variabel att spara ordet i
        String morseWord = "";

        //ta in ett ord på engelska och splitta det till en array av chars
        String[] engChars = myEngWord.split("");

        //loopa igenom arrayen
        for (String engChar : engChars) {

            //1.For varje enskild char
            //2.kolla IF char inte finns i arrayen i så fall returnera null
            //3.ELSE ersätt bokstaven med morsekod bygg ihop morsekoden till ett ord och särskilj bokstäverna med blanksteg

            if (getMorseCode(engChar) == null) { // Felhantering
                return null;
            } else {
                morseWord += getMorseCode(engChar) + " ";

            }
        }
        //returnera
        return morseWord;
    }

    public String getEngWord(String myMorseWord) {

        String engWord = "";

        String[] morseCodes = myMorseWord.split(" ");

        for (String morseCode : morseCodes) {

            if (getEngChar(morseCode) == null) {
                return null;
            } else {
                engWord += getEngChar(morseCode);
            }
        }

        return engWord;
    }

}