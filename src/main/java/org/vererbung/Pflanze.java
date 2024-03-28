package org.vererbung;

public class Pflanze extends Lebewesen{
  boolean hatNadeln;

  public Pflanze(){
    System.out.println("Pflanze: Konstruktor ohne Argumenten");
  }

  public Pflanze(int alter, double groesse, boolean hatNadeln){
    super(alter, groesse);
    this.hatNadeln = false;
    System.out.println("Pflanze: Konstruktor mit 3 Argumenten");
  }
  public void gebeFruechte() {
    System.out.println("Fruechte...");
  }
}
