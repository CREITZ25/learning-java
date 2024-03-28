package org.vererbung;

public class Lebewesen {
  int alter;
  double groesse;

  public Lebewesen(){
    System.out.println("Lebewesen: Konstruktor ohne Argumente");
  }
  public Lebewesen(int alter, double groesse){
    this.alter = alter;
    this.groesse = groesse;
    System.out.println("Lebewesen: Konstruktor mit 2 Argumenten");
  }
  public void fortpflanzen() {
    System.out.println("Fortpflanzen...");
  }

  public void wachsen() {
    this.groesse++;
  }
}
