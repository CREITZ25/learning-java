package org.training;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeExample {
  public static void main(String[] args) {

    LocalDate date = LocalDate.of(2024, Month.APRIL, 25);
    System.out.println(date);

    LocalTime time = LocalTime.of(16, 55, 30);
    System.out.println(time);

    LocalDateTime ldt = LocalDateTime.of(2024, Month.APRIL, 25, 13, 22, 50);
    System.out.println(ldt);

    LocalDateTime jetzt = LocalDateTime.now();
    System.out.println(jetzt);

    LocalDateTime spaeter =jetzt.plusMonths(5).plusDays(3).minusSeconds(20);
    System.out.println(spaeter);

    System.out.println(jetzt.toLocalDate().isLeapYear());

    System.out.println(jetzt.isAfter(spaeter));

    System.out.println(Duration.between(jetzt,spaeter).toDays());

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd. MMMM yyyy H:m:s").withLocale(Locale.US);
    System.out.println(formatter.format(jetzt));

    long beginn = System.nanoTime();

    for (int i = 0; i < 500000; i++) {
      double x = Math.sin(i);
    }

    long ende = System.nanoTime();

    System.out.println(ende - beginn);

    LocalDateTime start = LocalDateTime.now();
    for (int i = 0; i < 500000; i++) {
      double x = Math.sin(i);
    }
    LocalDateTime stop = LocalDateTime.now();
    System.out.println(Duration.between(start, stop).toNanos());
  }

}
