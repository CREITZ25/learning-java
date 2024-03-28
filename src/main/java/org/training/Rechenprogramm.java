package org.training;

public class Rechenprogramm {

    public static void main(String[] args) {
      int a = 6;
      int b = 4;

      System.out.println(Taschenrechner.max(a,b));
      System.out.println(Taschenrechner.abs(a));
      System.out.println(Taschenrechner.abs(b));
      System.out.println(Taschenrechner.add(a,b));
      System.out.println(Taschenrechner.sub(a,b));
      System.out.println(Taschenrechner.mul(a,b));
      System.out.println(Taschenrechner.div(a,b));
      System.out.println(Taschenrechner.mod(a,b));

      String[][] multTable1 = new String[10][10];

      for (int i = 0; i < multTable1.length; i++) {
        for (int j = 0; j < multTable1.length; j++) {
          // Indiziert wird von 0 an, der erste Inhalt ist aber 1 * 1 und nicht 0 * 0. Also beide Variablen + 1!
          multTable1[i][j] = (i + 1) + " * " + (j + 1) + " = " + ((i + 1) * (j + 1));
        }
      }

      for (int i = 0; i < multTable1.length; i++) {
        for (int j = 0; j < multTable1.length; j++) {
          System.out.printf("%14s", multTable1[i][j] + "\t");
        }
        System.out.println();
      }
      System.out.println();
      System.out.println();

      int[][] multTable = new int[10][10];

      for (int i = 0; i < multTable.length; i++) {
        for (int j = 0; j < multTable.length; j++) {
          // Indiziert wird von 0 an, der erste Inhalt ist aber 1 * 1 und nicht 0 * 0. Also beide Variablen + 1!
          multTable[i][j] = (i + 1) * (j + 1);
        }
      }

      for (int i = 0; i < multTable.length; i++) {
        for (int j = 0; j < multTable.length; j++) {
          System.out.printf("%d * %d = %3d \t", (1 + 1), (j + 1), multTable[i][j]);
        }
        System.out.println();
      }


    }
  }
