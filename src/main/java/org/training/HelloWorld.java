package org.training;

import java.time.LocalDateTime;

public class HelloWorld {

  public static void main(String[] args) {
    String name = "Carsten";
    String job = "Software Entwickler";
    int time = LocalDateTime.now().getHour();
    System.out.println(time);
    showGreetings(time);
    System.out.println("Ich heiße " + name + ". Ich arbeite als " + job + ".");
  }
  public static void showGreetings(Integer hour){
    if (hour < 12) {
      System.out.println("Guten Morgen!");
    } else if (hour < 18) {
      System.out.println("Guten Tag!");
    } else {
      System.out.println("Guten Abend!");
    }
  }
}
