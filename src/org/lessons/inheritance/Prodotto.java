package org.lessons.inheritance;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {

  protected int codice;
  protected String nome;
  protected String marca;
  protected BigDecimal prezzo;
  protected float iva;

  // ; constructor
  public Prodotto(String nome, String marca, BigDecimal prezzo, float iva) {
    Random nun = new Random();
    this.codice = nun.nextInt();
    this.nome = nome;
    this.marca = marca;
    this.prezzo = prezzo;
    this.iva = iva;
  }

  // , getters

  public int getCodice() {
    return codice;
  }

  public String getNome() {
    return nome;
  }

  public String getMarca() {
    return marca;
  }

  public BigDecimal getPrezzo() {
    return prezzo;
  }

  public float getIva() {
    return iva;
  }

  // > setters

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setPrezzo(BigDecimal prezzo) {
    this.prezzo = prezzo;
  }

  public void setIva(float iva) {
    this.iva = iva;
  }

  @Override
  public String toString() {
    return String.format("Codice: %d, Nome: %s, Marca: %s, Prezzo: %.2f, Iva: %.2f", this.codice, this.nome, this.marca,
        this.prezzo, this.iva);
  }
}
