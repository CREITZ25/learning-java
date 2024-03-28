package org.training;

public class Datum {
  int jahr, monat, tag;
  public void verschiebe_einen_Monat() {
    monat++;
    if (monat>12) {
      monat = 1;
      jahr++;
    }
  }
  public void verschiebe_x_Monate( int anz) {
    monat = monat + anz;
    if (monat>12) {
      monat = monat - 12;
      jahr++;
    }
  }
}