package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanMenu = new Scanner(System.in);
    String[] arrayNomeAtividades = new String [20];
    int[] arrayPesoAtividade = new int[20];

    System.out.println("Digite a quantidade de atividades para cadastrar:");

    short qntAtividade = scanMenu.nextShort();

    for (int atividade = 1; atividade <= qntAtividade; atividade++) {
      System.out.println("Digite o nome da atividade " + atividade + ":");

      int index = atividade - 1;
      String nomeAtividade = scanMenu.next();
      arrayNomeAtividades[index] = nomeAtividade;

      System.out.println("Digite o peso da atividade " + atividade + ":");

      int pesoAtividade = scanMenu.nextInt();
      arrayPesoAtividade[index] = pesoAtividade;
    }
  }
}