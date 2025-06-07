package org.lessons.inheritance;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

  private String imei;
  private int memoria;

  // ; constructor
  public Smartphone(String nome, String marca, BigDecimal prezzo, float iva, String imei, int memoria) {
    super(nome, marca, prezzo, iva);
    this.imei = imei;
    this.memoria = memoria;
  }

  // , getters

  public String getImei() {
    return imei;
  }

  public int getMemoria() {
    return memoria;
  }

  // > setters

  public void setImei(String imei) {
    this.imei = imei;
  }

  public void setMemoria(int memoria) {
    this.memoria = memoria;
  }

  @Override
  public String toString() {
    return super.toString() + ", " + String.format("Imei: %s, Memoria: %dGB", this.imei, this.memoria);
  }
}
