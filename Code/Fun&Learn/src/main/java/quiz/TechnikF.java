package main.java.quiz;

public final class TechnikF implements Questions {
  private String[][] te;

  public TechnikF() {
    initQ();
  }

  @Override
  public String[][] getArray() {
    return te;
  }

  private void initQ() {
    this.te = new String[1][6];

    this.te[0][0] = "Welches gaengige Problem kann bei der Inbetriebnahme eines Raspberry Pi auftreten?";
    this.te[0][1] = "Kein Apfelsaft im Kuehlschrank";
    this.te[0][2] = "Kein Stromkabel angeschlossen";
    this.te[0][3] = "Bitte wenden";
    this.te[0][4] = "Hier koennte Ihre Werbung stehen";
    this.te[0][5] = "b";
  }
}
