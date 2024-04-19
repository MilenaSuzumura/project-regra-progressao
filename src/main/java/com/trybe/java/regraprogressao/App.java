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

    try {
      String[] arrayNome = new String [qnt];
      int[] arrayPeso = new int[qnt];

      for (int atividade = 1; atividade <= qnt; atividade++) {
        System.out.println("Digite o nome da atividade " + atividade + ": ");

        int index = atividade - 1;
        String nomeAtividade = scanMenu.next();
        arrayNome[index] = nomeAtividade;
        System.out.println("Digite o peso da atividade " + atividade + ": ");
        int pesoAtividade = scanMenu.nextInt();
        arrayPeso[index] = pesoAtividade;
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }

}