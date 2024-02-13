package org.vererbung;

public class Main {
  public static void main(String[] args) {
    Tier tier = new Tier(4, 1.25);
    tier.fortpflanzen();

    Tier tier2 = new Tier(3, 1.33, "miau", false);
    tier.macheGeraeusch();

    Pflanze pflanze = new Pflanze(3,1.25, false);
    System.out.println(pflanze.alter);
  }
}
