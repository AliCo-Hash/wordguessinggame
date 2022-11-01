package game;

import java.util.Random;

public class Game {
  public Game() {
    getRandomWordFromDictionary();
  }

  public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
  Integer attempts = 10;
  public static void main(String[] args) {}

  public String getWordToGuess(String word) {
    StringBuilder sB = new StringBuilder(word);
    for (int i = 1; i < word.length(); i++) {
      sB.replace(i, word.length(), "_");
    }
    return sB.toString();
  }

  public String getRandomWordFromDictionary() {
    Random rnd = new Random();
    return DICTIONARY[rnd.nextInt(DICTIONARY.length)];
  }
}
