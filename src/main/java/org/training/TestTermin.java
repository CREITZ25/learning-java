package org.training;

import java.util.Scanner;

public class TestTermin {
  public static void main(String[] args) {
    Datum abgabe = new Datum();
    abgabe.jahr = 2012;
    abgabe.monat = 9;
    abgabe.tag = 15;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Um wieviele Monate soll der Termin verschoben werden?");
    Integer number = scanner.nextInt();

//    abgabe.verschiebe_einen_Monat();
    System.out.print("von "+abgabe.monat);
    System.out.print("/");
    System.out.println(abgabe.jahr);
    abgabe.verschiebe_x_Monate( number );
    System.out.print("nach "+abgabe.monat);
    System.out.print("/");
    System.out.println(abgabe.jahr);
  }
}
