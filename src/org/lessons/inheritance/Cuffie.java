package org.lessons.inheritance;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

  private String colore;
  private boolean isWireless;

  // ; constructor
  public Cuffie(String nome, String marca, BigDecimal prezzo, float iva, String colore,
      boolean isWireless) {
    super(nome, marca, prezzo, iva);
    this.colore = colore;
    this.isWireless = isWireless;
  }

  // , getters

  public String getColore() {
    return colore;
  }

  public boolean getIsWireless() {
    return isWireless;
  }

  // > setters

  public void setColore(String colore) {
    this.colore = colore;
  }

  public void setIsWireless(boolean isWireless) {
    this.isWireless = isWireless;
  }

  @Override
  public String toString() {
    return super.toString() + ", " + String.format("Colore: %s, Wireless: %b", this.colore, this.isWireless);
  }
}
