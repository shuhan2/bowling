public class SingleBowling {



  private int firstScore;
  private int secondScore;

  public void rollFirst(int firstPin) {
    firstScore = firstPin;
  }

  public void rollSecond(int secondPin) {
    secondScore = secondPin;
  }

  public int getScore() {
    return firstScore + secondScore;
  }

  public int getFirstScore() {
    return firstScore;
  }

  public boolean isStrike() {
    return firstScore == 10;
  }

  public boolean isSpare() {
    return (firstScore + secondScore) == 10;
  }
}
