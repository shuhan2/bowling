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


  public void roll(int pin) {
    if (isFirstRoll) {
      bowlings[currentIndex].rollFirst(pin);
      if (pin == 10) {
        bowlings[++currentIndex] = new SingleBowling();
      } else {
        isFirstRoll = false;
      }
    } else {
      bowlings[currentIndex++].rollSecond(pin);
      if(currentIndex < 10) {
        bowlings[currentIndex] = new SingleBowling();
        isFirstRoll = true;
      }
    }
  }

  public int getScore() {
    int score = 0;
    for (int i = 0; i < 10; i++) {
      score += bowlings[i].getScore();
      if (bowlings[i].isStrike()) {
        score += bowlings[i+1].getScore();
      }
    }
    return score;
  }
}
