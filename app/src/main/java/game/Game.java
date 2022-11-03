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
      Character currentLetter = word.charAt(i);

      if (guessedLetters.indexOf(currentLetter) != -1) {
        sB.append(currentLetter);
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
      return true;
    } else {
      return false;
    }
  }
}
