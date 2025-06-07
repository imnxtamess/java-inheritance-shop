package org.lessons.inheritance;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    Prodotto prodotto = new Prodotto("Televisore", "Samsung", new BigDecimal(299.99), 23.00f);

    System.out.println(prodotto);

    Televisori televisore = new Televisori("4KOLED", "HiSense", new BigDecimal(399.99), 23.00f, "40x80x5", true);

    System.out.println(televisore);

    Cuffie cuffie = new Cuffie("Beat", "Sony", new BigDecimal(99.99), 23.00f, "nero", true);

    System.out.println(cuffie);

    Smartphone smartphone = new Smartphone("Pixel Pro 8", "Google", new BigDecimal(799.99), 23.00f,
        "wejanlwaoq234joeiqw", 512);

    System.out.println(smartphone);
  }
}
