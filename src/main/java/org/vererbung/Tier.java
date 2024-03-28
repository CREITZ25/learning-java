package org.vererbung;

public class Tier extends Lebewesen{
  String geraeusch;
  boolean kannFliegen;

  public Tier(int alter, double groesse){
    super(alter, groesse);
    this.geraeusch = "";
    System.out.println("Tier: Konstruktor mit 2 Argumenten");
  }
  public Tier(int alter, double groesse, String geraeusch, boolean kannFliegen){
    super(alter, groesse);
    this.geraeusch = geraeusch;
    this.kannFliegen = kannFliegen;
    System.out.println("Tier: Konstruktor mit 4 Argumenten");
  }

  public void macheGeraeusch()  {
    System.out.println(geraeusch);
  }
}
