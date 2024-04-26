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

    int pesoTotal = 0;
    double notaFinalCima = 0;

    for (int atividade = 1; atividade <= qnt; atividade++) {
      System.out.println("Digite o nome da atividade " + atividade + ": ");
      String nomeAtividade = scanMenu.nextLine();

      System.out.println("Digite o peso da atividade " + atividade + ": ");
      int pesoAtividade = Integer.parseInt(scanMenu.nextLine());
      pesoTotal = pesoTotal + pesoAtividade;

      System.out.println("Digite a nota obtida para " + nomeAtividade + ":");
      int notaAtividade = Integer.parseInt(scanMenu.nextLine());
      double calculoVezes = pesoAtividade * notaAtividade;
      notaFinalCima = notaFinalCima + calculoVezes;
    }

    if (pesoTotal != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else {
      double notaFinal = notaFinalCima / pesoTotal;

      if (notaFinal >= 85) {
        System.out.print("Parabéns! Você alcançou " + notaFinal + "%");
        System.out.println("! E temos o prazer de informar que você obteve aprovação!");
      } else {
        System.out.print("Lamentamos informar que, ");
        System.out.print("com base na sua pontuação alcançada neste período, " + notaFinal + "%");
        System.out.println(", você não atingiu a pontuação mínima necessária para sua aprovação.");
      }
    }

    scanMenu.close();

  }
}