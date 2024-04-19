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

    System.out.println("Digite a quantidade de atividades para cadastrar:");

    short qntAtividade = scanMenu.nextShort();

    String[] arrayNomeAtividades = new String [qntAtividade];
    int[] arrayPesoAtividade = new int[qntAtividade];
    int[] arrayNotaAtividade = new int[qntAtividade];


    for (int atividade = 1; atividade <= qntAtividade; atividade++) {
      System.out.println("Digite o nome da atividade " + atividade + ":");

      int index = atividade - 1;
      String nomeAtividade = scanMenu.next();
      arrayNomeAtividades[index] = nomeAtividade;

      System.out.println("Digite o peso da atividade " + atividade + ":");

      int pesoAtividade = scanMenu.nextInt();
      arrayPesoAtividade[index] = pesoAtividade;

      System.out.println("Digite a nota obtida para " + nomeAtividade + ":");
      int notaAtividade = scanMenu.nextInt();
      arrayNotaAtividade[index] = notaAtividade;
    }

    int totalPesos = calculaPeso(arrayPesoAtividade);
    if (totalPesos != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    double notaFinal = calculaNota(arrayNotaAtividade, arrayPesoAtividade, totalPesos);

    if (notaFinal > 85) {
      System.out.println("Parabéns! Você alcançou " + notaFinal + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação alcançada neste período, " + notaFinal + "%, você não atingiu a pontuação mínima necessária para sua aprovação");
    }
  }

  private static int calculaPeso(int[] allPesos) {
    int totalPesos = 0;
    for (int i = 0; i < allPesos.length; i++) {
      totalPesos = totalPesos + allPesos[i];
    }

    return totalPesos;
  }

  private static double calculaNota(int[] allNotas, int[] allPesos, int totalPesos) {
    double[] value1 = new double[allPesos.length - 1];

    for (int i = 0; i < allPesos.length; i++) {
      value1[i] = allPesos[i] * allNotas[i];
    }

    System.out.println(value1[0]);
    double value2 = 0;

    for (int i = 0; i < value1.length; i++) {
      value2 = value2 + value1[i];
    }

    return value2 / totalPesos;
  }

}