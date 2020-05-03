import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SingleBowlingTest {

  @Test
  void should_return_0_when_get_score_given_0_every_time() {
    SingleBowling singleBowling = new SingleBowling();
    singleBowling.rollFirst(0);
    singleBowling.rollSecond(0);

    assertEquals(0, singleBowling.getScore());
  }

  @Test
  void should_return_9_when_get_score_given_0_and_9() {
    SingleBowling singleBowling = new SingleBowling();
    singleBowling.rollFirst(0);
    singleBowling.rollSecond(9);

    assertEquals(9, singleBowling.getScore());
  }

  @Test
  void should_return_true_when_verify_is_strike_given_10_for_first_time() {
    SingleBowling singleBowling = new SingleBowling();
    singleBowling.rollFirst(10);

    assertTrue(singleBowling.isStrike());
  }

  @Test
  void should_return_true_when_verify_is_spare_given_1_for_first_time_and_9_for_second() {
    SingleBowling singleBowling = new SingleBowling();
    singleBowling.rollFirst(1);
    singleBowling.rollSecond(9);

    assertTrue(singleBowling.isSpare());
  }
}