package game;

import java.util.ArrayList;
import java.util.Random;

public class Game {
  String word;
  ArrayList<Character> guessedLetters = new ArrayList<Character>();
  Integer attempts = 10;

  public Game(WordChoser choser) {
    this.word = choser.getRandomWordFromDictionary();
  }

  public static void main(String[] args) {}

  public String getWordToGuess() {
    StringBuilder sB = new StringBuilder(this.word);
    for (int i = 1; i < word.length(); i++) {
      sB.replace(i, word.length(), "_");
    }
    return sB.toString();
  }

  public Boolean guessLetter(Character letter) {
    if (this.word.indexOf(letter) != -1) {
      guessedLetters.add(letter);
      return true;
    } else {
      attempts--;
      return false;
    }
  }
}
