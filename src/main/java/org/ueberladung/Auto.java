package org.ueberladung;

public class Auto extends Fahrzeug{
  int geschwindigkeit = 120;

  public void fahren() {
    super.fahren();
    System.out.println("Brum brum");
  }
}
