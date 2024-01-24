package org.training;

public class Program {
  public static void main(String[] args) {
    Car car1 = new Car("grün", "VW", 130);
    car1.drive();
    car1.drive(30);
    car1.drive("schnell");
  }
}
