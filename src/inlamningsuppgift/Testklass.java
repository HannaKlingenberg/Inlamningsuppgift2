package inlamningsuppgift;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class Testklass {

    @Test
    public void charEngToMorse() {
        Converter converter = new Converter();
        String myEngChar = "a";
        String expected = ".-";

        String actual = converter.getMorseChar(myEngChar);

        assertEquals(expected, actual);
    }

    @Test
    public void charMorseToEng() {
        Converter converter = new Converter();
        String myMorseChar = ".-";
        String expected = "a";

        String actual = converter.getEngChar(myMorseChar);

        assertEquals(expected, actual);
    }

    @Test
    public void toLower() {
        Converter converter = new Converter();

        String myEngChar = "A";
        String expected = "a";

        String actual = converter.toLower(myEngChar);

        assertEquals(expected, actual);
    }

    @Test
    public void upperCharEngToMorse() {
        Converter converter = new Converter();

        String myEngChar = "Z";
        String expected = "--..";

        String actual = converter.getMorseChar(myEngChar);

        assertEquals(expected, actual);
    }


    @Test
    public void wordEngToMorse() {
        Converter converter = new Converter();

        String myEngWord = "ABC";
        String expected = ".- -... -.-. ";

        String actual = converter.getMorseWord(myEngWord);

        assertEquals(expected, actual);
    }
    @Test
    public void invalidWordEngToWord(){
        Converter converter = new Converter();

        String myEngWord = "H ann a";
        String expected = null;

        String actual = converter.getMorseWord(myEngWord);

        assertEquals(expected, actual);
    }

    /*@Test
    public void wordMorseToEng() {
        Converter converter = new Converter();
        HashMap<String, String> morseToEng = new HashMap<String, String>();
        String myMorseWord = ".- -... -.-. ";
        String expected = "ABC";

        String actual = converter.getEngWord(myMorseWord);

        assertEquals(expected, actual);
    }*/
}