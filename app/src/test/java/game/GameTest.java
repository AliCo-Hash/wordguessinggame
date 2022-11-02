package game;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedChoser);

    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test public void testGetsWordToGuess2() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("CANDIES");
    Game game = new Game(mockedChoser);
    
    assertEquals(game.getWordToGuess(), "C______");
  }
  
  @Test public void testGetRemainingAttempts() {
    WordChoser mockedChoser = mock(WordChoser.class);
    Game game = new Game(mockedChoser);

    assertEquals(game.attempts, Integer.valueOf(10));
  }

  @Test public void testGuessLetterCorrectAndDisplayLetter() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("CANDIES");
    Game game = new Game(mockedChoser);

    assertEquals(game.guessLetter('A'), true);
  }

  @Test public void testGuessLetterIncorrectAndReduceAttemps() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("CANDIES");
    Game game = new Game(mockedChoser);

    assertEquals(game.guessLetter('Z'), false);
    assertEquals(game.attempts, Integer.valueOf(9));
  }
}