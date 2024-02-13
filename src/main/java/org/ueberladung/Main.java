package org.ueberladung;

public class Main {
  public static void main(String[] args) {
    Auto auto = new Auto();
    auto.fahren();
    // -> Brum brum
    Fahrzeug fahrzeug = new Fahrzeug();
    fahrzeug.fahren();
    // -> Motor gestartet

    System.out.println(auto.geschwindigkeit);
  }
}
