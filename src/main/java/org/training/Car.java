package org.training;

public class Car {
  private String color;
  private String brand;
  private int horsePower;

  public Car(String color, String brand, int horsePower) {
    this.color = color;
    this.brand = brand;
    this.horsePower = horsePower;
  }

  public void drive() {
    System.out.println("Das Auto fährt...");
  }

  public void drive(int speed) {
    System.out.println("Das Auto fährt " + speed + " km/h");
  }

  public void drive(String speed) {
    System.out.println("Das Auto fährt " + speed);
  }

}
