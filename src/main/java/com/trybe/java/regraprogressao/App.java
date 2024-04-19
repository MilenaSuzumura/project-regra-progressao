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
    System.out.println("Digite a quantidade de atividades para cadastrar: ");

    Scanner scanMenu = new Scanner(System.in);
    short qnt = Short.parseShort(scanMenu.nextLine());

    for (int atividade = 1; atividade <= qnt; atividade++) {
      System.out.println("Digite o nome da atividade " + atividade + ": ");
      String nomeAtividade = scanMenu.nextLine();

      System.out.println("Digite o peso da atividade " + atividade + ": ");
      int pesoAtividade = Integer.parseInt(scanMenu.nextLine());

      System.out.println("Digite a nota obtida para " + nomeAtividade + ":");
      int notaAtividade = Integer.parseInt(scanMenu.nextLine());
    }

    scanMenu.close();

  }

}