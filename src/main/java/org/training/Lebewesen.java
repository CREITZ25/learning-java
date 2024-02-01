package org.training;

public class Lebewesen {
  int alter;
  double groesse;

  public void fortpflanzen() {
    System.out.println("Fortpflanzen...");
  }

  public void wachsen() {
    this.groesse++;
  }
}
