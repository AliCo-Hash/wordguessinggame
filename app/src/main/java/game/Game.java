package game;

public class Game {
  public Game(String word) {}
  Integer attempts = 10;
  public static void main(String[] args) {}

  public String getWordToGuess(String word) {
    StringBuilder sB = new StringBuilder(word);
    for (int i = 1; i < word.length(); i++) {
      sB.replace(i, word.length(), "_");
    }
    return sB.toString();
  }

}
