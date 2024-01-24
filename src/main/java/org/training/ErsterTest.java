package org.training;

import java.util.Scanner;

public class ErsterTest {
  public static void main(String[] args) {

    Scanner myscanner = new Scanner(System.in);
    System.out.println("Bitte gebe einen Begriff ein:");
    String text = myscanner.nextLine();
    System.out.println("Du hast \""+text+"\" eingegeben.");
  }
}