package org.training;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class ZahlenratenCMD {
  static Integer myNumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);
  static Integer tries = 0;

  public static void main(String[] args) {
    //       System.out.println("The number is " + myNumber);
    nextRound();
  }

  public static void nextRound() {
    tries++;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte gebe eine Zahl ein:");
    Integer number = scanner.nextInt();
    guess(number);
  }

  public static void guess(Integer number) {
    if (number == myNumber) {
      System.out.println("Richtig geraten!!!");
      System.out.println("Du hast " + tries + " Versuche gebraucht!");
    } else {
      System.out.println("Falsch geraten!!!");
      if (number < myNumber) {
        System.out.println("Deine Zahl ist zu klein!");
      } else {
        System.out.println("Deine Zahl ist zu groß!");
      }
      nextRound();
    }
  }
}
