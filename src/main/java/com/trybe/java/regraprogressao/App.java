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

    System.out.println("Digite a quantidade de atividades para cadastrar: ");

    short qnt = scanMenu.nextShort();

    String[] arrayNome = new String [qnt -1];
    int[] arrayPeso = new int[qnt - 1];

    for (int atividade = 1; atividade <= qnt; atividade++) {
      System.out.println("Digite o nome da atividade " + atividade + ": ");

      int index = atividade - 1;
      String nomeAtividade = scanMenu.next();
      arrayNome[index] = nomeAtividade;

      System.out.println("Digite o peso da atividade " + atividade + ": ");

      int pesoAtividade = scanMenu.nextInt();
      arrayPeso[index] = pesoAtividade;
    }


    scanMenu.close();
  }

}