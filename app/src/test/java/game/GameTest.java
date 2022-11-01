package game;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    Game game = new Game("B_____");
    String word = "B_____";
    assertEquals(game.getWordToGuess(word), word);
  }

  @Test public void testGetsWordToGuess2() {
    Game game = new Game("MAKERS");
    String word = "MAKERS";
    assertEquals(game.getWordToGuess(word), "M_____");
  }
  
  @Test public void getRemainingAttempts() {
    Game game = new Game("MAKERS");
    assertEquals(game.attempts, Integer.valueOf(10));
  }
}