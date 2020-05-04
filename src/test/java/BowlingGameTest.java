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
}