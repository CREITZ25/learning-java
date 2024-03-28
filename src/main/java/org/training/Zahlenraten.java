package org.training;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Zahlenraten {
  static Integer myNumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);
  static Integer tries = 0;
  //einen Text ins Fenster bringen
  static JLabel text = new JLabel("Gebe eine Zahl zwischen 0 und 100 ein!");
  static JTextField textField = new JTextField();

  public static void main(String[] args) {
    //     System.out.println("The number is " + myNumber);
    openUI();
    //       nextRound();
  }

  public static void openUI() {
    //Variable frame vom Typ JFrame (Fenster)
    JFrame frame = new JFrame("Rate die Zahl!");
    frame.setSize(400, 300);
    frame.setLocation(100, 150);
    //Programm endet, wenn das Fenster geschlossen wird
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //den default-Look des Fensterseinstellen
    frame.setDefaultLookAndFeelDecorated(true);

    //einen Text ins Fenster bringen
    //        JLabel text = new JLabel("Gebe eine Zahl zwischen 0 und 100 ein!");
    //wo der Text stehen soll
    text.setBounds(50, 50, 350, 30);

    //Ein Textfeld ins Fenster bringen
    //        JTextField textField = new JTextField();
    textField.setBounds(50, 100, 200, 30);

    //Einen Button ins Fenster bringen
    JButton button = new JButton("Raten!");
    button.setBounds(50,150, 200,30);

    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          String textFromTextField = textField.getText();
          //Umwandlung in eine Zahl
          Integer number = Integer.parseInt(textFromTextField);
          guess(number);
        } catch (Exception error){
          text.setText("Bitte gebe eine Zahl ein!");
        }
      }
    });

    //den Elemente ins Fenster frame bringen
    frame.add(text);
    frame.add(textField);
    frame.add(button);
    //Das folgende Kommando erlaubt das die Elemente an den angegebenen Koordinaten erscheinen
    frame.setLayout(null);
    frame.setVisible(true);
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
      //            System.out.println("Richtig geraten!!!");
      //            System.out.println("Du hast " + tries + " Versuche gebraucht!");
      text.setText("Richtig geraten mit " + tries + " Versuchen!");
    } else {
      tries++;
      //           System.out.println("Falsch geraten!");
      if (number < myNumber) {
        //               System.out.println("Deine Zahl ist zu klein!");
        text.setText("Falsch geraten! Deine Zahl ist zu klein!");
      } else {
        //               System.out.println("Deine Zahl ist zu groß!");
        text.setText("Falsch geraten! Deine Zahl ist zu groß!");
      }
      textField.setText("");
      //            nextRound();
    }
  }

  //    public static void guess(Integer number) {
  //      if (number == myNumber) {
  //          System.out.println("Richtig geraten!!!");
  //          System.out.println("Du hast " + tries + " Versuche gebraucht!");
  //      } else {
  //          System.out.println("Falsch geraten!!!");
  //          if (number < myNumber) {
  //              System.out.println("Deine Zahl ist zu klein!");
  //          } else {
  //              System.out.println("Deine Zahl ist zu groß!");
  //          }
  //          nextRound();
  //      }
  //    }

}
