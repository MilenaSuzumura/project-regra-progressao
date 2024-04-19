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

    int[] arrayPeso = new int[qnt];
    int[] arrayNota = new int[qnt];

    for (int atividade = 1; atividade <= qnt; atividade++) {
      System.out.println("Digite o nome da atividade " + atividade + ": ");
      String nomeAtividade = scanMenu.nextLine();

      System.out.println("Digite o peso da atividade " + atividade + ": ");
      int pesoAtividade = Integer.parseInt(scanMenu.nextLine());
      arrayPeso[atividade] = pesoAtividade;

      System.out.println("Digite a nota obtida para " + nomeAtividade + ":");
      int notaAtividade = Integer.parseInt(scanMenu.nextLine());
      arrayNota[atividade] = notaAtividade;
    }

    int totalPesos = calculaPeso(arrayPeso);
    if (totalPesos != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
      scanMenu.close();
    }

    scanMenu.close();

  }

  private static int calculaPeso(int[] allPesos) {
    int totalPesos = 0;
    for (int i = 0; i < allPesos.length; i++) {
      totalPesos = totalPesos + allPesos[i];
    }
    return totalPesos;
  }
}