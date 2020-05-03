import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}