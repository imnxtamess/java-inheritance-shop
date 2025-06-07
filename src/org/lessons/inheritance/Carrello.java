package org.lessons.inheritance;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

  static Prodotto[] cart = new Prodotto[0];

  // > Add to cart method

  public static void addProduct(Prodotto product) {

    Prodotto[] tempArr = new Prodotto[cart.length + 1];

    for (int i = 0; i < cart.length; i++) {
      tempArr[i] = cart[i];
    }

    tempArr[tempArr.length - 1] = product;

    cart = tempArr;
  }

  // > Get total price method

  public static BigDecimal getTotalPrice() {

    BigDecimal totalPrice = new BigDecimal(0);

    for (Prodotto prodotto : cart) {
      totalPrice = totalPrice.add(prodotto.getPrezzo());
    }

    return totalPrice;
  }

  public static void main(String[] args) {

    // , Create product categories arrays

    Cuffie[] cuffie = {
        new Cuffie("Nothing ear Pro", "Nothing", new BigDecimal(99.00), 23.00f, "Nero", true),
        new Cuffie("Airpods", "Iphone", new BigDecimal(150.00), 23.00f, "white", true),
        new Cuffie("Earbuds Pro", "Google", new BigDecimal(100.00), 23.00f, "blue", true) };

    Televisori[] televisori = {
        new Televisori("Logitech 4k", "Logitech", new BigDecimal(400.00), 23.00f, "145x100x20", true),
        new Televisori("Hisense 4k", "Hisense", new BigDecimal(300.00), 23.00f, "115x80x10", true),
        new Televisori("Samsung 8k", "Samsung", new BigDecimal(600.00), 23.00f, "200x140x30", true) };

    Smartphone[] smartphones = {
        new Smartphone("Pixel 8 Pro", "Google", new BigDecimal(700.00), 23, "ae23ejdk", 256),
        new Smartphone("Pixel 9 Pro", "Google", new BigDecimal(900.00), 23, "ae24ejdk", 512),
        new Smartphone("Iphone 16 Pro", "Apple", new BigDecimal(1200.00), 23, "a26ipjdk", 512)
    };

    // ,

    Scanner scanner = new Scanner(System.in);
    boolean continueShopping = true;

    while (continueShopping) {

      // ; ASK USER FOR INPUT

      System.out.println("Would you like to add a product to the cart? yes/no ");

      boolean isInput = true;

      while (isInput) {
        String userInput = scanner.nextLine().toLowerCase();

        if (userInput.equals("yes")) {
          isInput = false;
        } else if (userInput.equals("no")) {
          isInput = false;
          System.out.println("Ok, bye.");
          continueShopping = false;
          break;
        } else {
          System.out.println("Please enter a valid input (yes/no)");

        }
      }

      // ;

      String[] categories = { "Smartphone", "Cuffie", "Televisori" };

      String categoriesToString = String.join(",", categories);

      String userChoice;
      boolean isCategoryInputWrong = true;
      boolean isProductNameWrong = true;

      while (isCategoryInputWrong) {

        System.out.println("Which category of product would you like to add? " + '(' + categoriesToString + ')');

        String userCategory = scanner.nextLine().toLowerCase();

        switch (userCategory) {
          case "smartphone":
            while (isProductNameWrong) {

              System.out.println("Which smartphone would you like to add to the cart: ");

              for (Smartphone smartphone : smartphones) {
                System.out.println(smartphone.getNome());
              }

              userChoice = scanner.nextLine().toLowerCase();

              for (Smartphone smartphone : smartphones) {
                if (userChoice.equals(smartphone.getNome().toLowerCase())) {
                  addProduct(smartphone);
                  System.out.println("Product added to the cart successfully");
                  isProductNameWrong = false;
                }

              }
              if (isProductNameWrong) {
                System.out.println("Please write the name correctly.");
              }
              isCategoryInputWrong = false;
            }
            break;
          case "cuffie":
            while (isProductNameWrong) {

              System.out.println("Which headphones would you like to add to the cart: ");

              for (Cuffie cuffia : cuffie) {
                System.out.println(cuffia.getNome());
              }

              userChoice = scanner.nextLine().toLowerCase();

              for (Cuffie cuffia : cuffie) {
                if (userChoice.equals(cuffia.getNome().toLowerCase())) {
                  addProduct(cuffia);
                  System.out.println("Product added to the cart successfully");
                  isProductNameWrong = false;
                }
              }
              if (isProductNameWrong) {
                System.out.println("Please write the name correctly.");
              }
              isCategoryInputWrong = false;
            }
            break;
          case "televisori":
            while (isProductNameWrong) {
              System.out.println("Which headphones would you like to add to the cart: ");

              for (Televisori televisore : televisori) {
                System.out.println(televisore.getNome());
              }

              userChoice = scanner.nextLine().toLowerCase();

              for (Televisori televisore : televisori) {
                if (userChoice.equals(televisore.getNome().toLowerCase())) {
                  addProduct(televisore);
                  System.out.println("Product added to the cart successfully");
                  isProductNameWrong = false;
                }
              }
              if (isProductNameWrong) {
                System.out.println("Please write the name correctly.");
              }
              isCategoryInputWrong = false;
            }
            break;
          default:
            System.out.println("Please write one of the categories: ");
            isCategoryInputWrong = true;
            break;
        }
      }

      System.out.println("Would you like to complete the purchase? type no if you want to add more to the cart");
      String showTotal = scanner.nextLine().toLowerCase();
      if (showTotal.equals("yes")) {
        continueShopping = false;
        System.out.println("Thank you for buying with us the total price is: " + getTotalPrice() + "€");
      }
      isCategoryInputWrong = true;
      isProductNameWrong = true;
    }
    scanner.close();
  }
}
