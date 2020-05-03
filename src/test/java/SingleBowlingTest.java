import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleBowlingTest {

  @Test
  void should() {
    SingleBowling singleBowling = new SingleBowling();
    singleBowling.rollFirst(0);
    singleBowling.rollSecond(0);

    assertEquals(0, singleBowling.getScore());
  }
}