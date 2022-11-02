package game;

import java.util.Random;

public class Game {
  String word;

  public Game(WordChoser choser) {
    this.word = choser.getRandomWordFromDictionary();
  }

  Integer attempts = 10;
  public static void main(String[] args) {}

  public String getWordToGuess() {
    StringBuilder sB = new StringBuilder(this.word);
    for (int i = 1; i < word.length(); i++) {
      sB.replace(i, word.length(), "_");
    }
    return sB.toString();
  }
}
