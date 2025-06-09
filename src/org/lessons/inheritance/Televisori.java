package org.lessons.inheritance;

import java.math.BigDecimal;

public class Televisori extends Prodotto {

  private String dimensioni;
  private boolean isSmart;

  // ; constructor

  public Televisori(String nome, String marca, BigDecimal prezzo, float iva, String dimensioni,
      boolean isSmart) {
    super(nome, marca, prezzo, iva);
    this.dimensioni = dimensioni;
    this.isSmart = isSmart;
  }

  // , getters

  public String getDimensioni() {
    return dimensioni;
  }

  public boolean getIsSmart() {
    return isSmart;
  }

  // > setters

  public void setDimensioni(String dimensioni) {
    this.dimensioni = dimensioni;
  }

  public void setBoolean(boolean isSmart) {
    this.isSmart = isSmart;
  }

  @Override
  public String toString() {
    return super.toString() + ", " + String.format("Dimensioni: %s, SmartTv: %b", this.dimensioni, this.isSmart);
  }
}
