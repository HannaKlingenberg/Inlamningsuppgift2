package inlamningsuppgift;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestConverter {
    @Test
    public void engToMorseCode() {
        Converter converter = new Converter();
        String myEngChar = "a";
        String expected = ".-";

        String actual = converter.getMorseCode(myEngChar);

        assertEquals(expected, actual);
    }

    @Test
    public void morseCodeToEng() {
        Converter converter = new Converter();
        String myMorseCode = ".";
        String expected = "e";

        String actual = converter.getEngChar(myMorseCode);

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
    public void upperCharEngToMorseCode() {
        Converter converter = new Converter();
        String myEngChar = "E";
        String expected = ".";

        String actual = converter.getMorseCode(myEngChar);

        assertEquals(expected, actual);
    }

    @Test
    public void wordEngToMorse() {
        Converter converter = new Converter();
        String myEngWord = "HEJ";
        String expected = ".... . .---";

        String actual = converter.getMorseWord(myEngWord);

        assertEquals(expected, actual);
    }

    @Test
    public void wordMorseToEng() {
        Converter converter = new Converter();
        String myMorseWord = ".... . .---";
        String expected = "hej";

        String actual = converter.getEngWord(myMorseWord);

        assertEquals(expected, actual);
    }

    @Test
    public void invalidWordEngToMorse(){
        Converter converter = new Converter();
        String myEngWord = "ha nn A";
        String expected = null;

        String actual = converter.getMorseWord(myEngWord);

        assertEquals(expected, actual);
    }

    @Test
    public void invalidWordMorseToEng(){
        Converter converter = new Converter();
        String myMorseWord = "inte morse";
        String expected = null;

        String actual = converter.getEngWord(myMorseWord);

        assertEquals(expected, actual);
    }
}