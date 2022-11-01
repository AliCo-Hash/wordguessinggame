package game;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;


public class WordChoserTest {
  @Test public void ContainsADictionary() {
    WordChoser wordchoser = new WordChoser();
    String[] DICTIONARY1 = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

    assertTrue(Arrays.asList(DICTIONARY1).contains(wordchoser.getRandomWordFromDictionary()));
  }
}
