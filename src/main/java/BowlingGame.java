public class BowlingGame {

  private SingleBowling[] bowlings;
  private Boolean isFirstRoll;
  private Boolean isThirdRoll;
  private int currentIndex;

  public BowlingGame() {
    this.bowlings = new SingleBowling[10];
    bowlings[0] = new SingleBowling();
    this.isFirstRoll = true;
    this.isThirdRoll = false;
  }


  public void roll(int pin) {
    if (isThirdRoll) {
      bowlings[currentIndex].rollThird(pin);
    }
    else if (isFirstRoll) {
      bowlings[currentIndex].rollFirst(pin);
      if (bowlings[currentIndex].isStrike()) {
        bowlings[++currentIndex] = new SingleBowling();
      } else {
        isFirstRoll = false;
      }
    } else {
      bowlings[currentIndex].rollSecond(pin);
      if (currentIndex == 9 && (bowlings[currentIndex].isSpare() || bowlings[currentIndex].isStrike())) {
        isThirdRoll = true;
      }
      if (currentIndex < 9) {
        bowlings[++currentIndex] = new SingleBowling();
        isFirstRoll = true;
      }
    }
  }

  public int getScore() {
    int score = 0;
    for (int index = 0; index < 10; index++) {
      score += bowlings[index].getScore();
      if (index < 9) {
        if (bowlings[index].isStrike()) {
          score += bowlings[index + 1].getScore();
        } else if (bowlings[index].isSpare()) {
          score += bowlings[index + 1].getFirstScore();
        }
      }
    }
    return score;
  }
}
