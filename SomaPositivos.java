package com.mycompany.somapositivos;

import java.util.Scanner;

public class SomaPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Digite números inteiros (um número negativo para sair):");

        while (true) {
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            soma += numero;
        }
        System.out.println("Soma dos números positivos: " + soma);
        scanner.close();
    }
}
