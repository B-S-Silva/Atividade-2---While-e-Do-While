
package com.mycompany.adivinharnumero;

import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 7; 
        int palpite;
        int tentativas = 0;

        System.out.println("Adivinhe o número entre 1 e 100:");

        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Você acertou! O número era " + numeroSecreto + ".");
                break;
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Muito baixo! Tente novamente.");
            }
        }

        System.out.println("Você fez " + tentativas + " tentativas.");
        scanner.close();
    }
}


