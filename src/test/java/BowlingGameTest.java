import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

  @Test
  void should_return_0_when_get_score_given_get_0_every_time() {

    BowlingGame bowlingGame = new BowlingGame();
    for (int i = 0; i < 20; i++) {
      bowlingGame.roll(0);
    }
    assertEquals(0, bowlingGame.getScore());
  }

  @Test
  void should_return_80_when_get_score_given_get_4_every_time() {

    BowlingGame bowlingGame = new BowlingGame();
    for (int i = 0; i < 20; i++) {
      bowlingGame.roll(4);
    }
    assertEquals(80, bowlingGame.getScore());
  }

  @Test
  void should_return_90_when_get_score_given_get_4_every_time() {

    BowlingGame bowlingGame = new BowlingGame();
    bowlingGame.roll(10);
    for (int i = 0; i < 18; i++) {
      bowlingGame.roll(4);
    }
    assertEquals(90, bowlingGame.getScore());
  }

}