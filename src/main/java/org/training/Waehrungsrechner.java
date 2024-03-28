package org.training;
import java.util.Scanner;
public class Waehrungsrechner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte gebe einen Betrag in EUR an:");
    Double money = scanner.nextDouble();
    convertToDollar(money);
    convertToCHF(money);
    convertToYen(money);
  }

  public static void convertToDollar(Double eur) {
    System.out.println("Der Betrag in Dollar ist: " + eur * 1.20);
  }

  public static void convertToCHF(Double eur) {
    System.out.println("Der Betrag in CHF ist: " + eur * 0.96);
  }
  public static void convertToYen(Double eur) {
    System.out.println("Der Betrag in Yen ist: " + eur * 157.94);
  }
}
