import java.util.Arrays;

public class BowlingGame {

  private SingleBowling[] bowlings;
  private Boolean isFirstRoll;
  private int currentIndex;

  public BowlingGame() {
    this.bowlings = new SingleBowling[10];
    bowlings[0] = new SingleBowling();
    this.isFirstRoll = true;
  }


  public int getScore() {
    return Arrays.stream(bowlings)
        .map(SingleBowling::getScore)
        .reduce(0, Integer::sum);
  }

  public void roll(int pin) {
    if (isFirstRoll) {
      bowlings[currentIndex].rollFirst(pin);
      isFirstRoll = false;
    } else {
      bowlings[currentIndex++].rollSecond(pin);
      if(currentIndex < 10) {
        bowlings[currentIndex] = new SingleBowling();
        isFirstRoll = true;
      }
    }
  }
}
