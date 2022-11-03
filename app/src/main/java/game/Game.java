package game;

import java.util.ArrayList;

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

      if (guessedLetters.indexOf(word.charAt(i)) != -1) {
        sB.replace(i, word.length(), Character.toString(word.charAt(i)));
      } else {
        sB.replace(i, word.length(), "_");
      }
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

  public Boolean isGameLost() {
    if (attempts == 0) {
      System.out.println("0 attempts remaining, better luck next time");
      return true;
    } else {
      return false;
    }
  }

  public Boolean isGameWon() {
    
    for (int i = 1 ; i < word.length() ; i++) {
        Character letter = word.charAt(i);
        if (guessedLetters.indexOf(letter) == -1) {
            return false;
        }
    }

    return true;
}
}
