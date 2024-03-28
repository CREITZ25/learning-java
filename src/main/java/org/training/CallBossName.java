package org.training;

import java.util.Scanner;
public class CallBossName {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    SayBossName myObject = new SayBossName();
    System.out.println("Wie heißt dein Boss?");
    String temp = input.nextLine();
  /*  SayBossName.setBossName(temp);
    System.out.println("Dein Boss heißt: " + SayBossName.getBossName());*/
  }
}
