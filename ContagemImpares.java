
package com.mycompany.contagemimpares;

import java.util.Scanner;

public class ContagemImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorImpares = 0;

        do {
            System.out.print("Digite um número inteiro (ou 0 para sair): ");
            numero = scanner.nextInt();

            if (numero % 2 != 0) {
                contadorImpares++;
            }
        } while (numero != 0);

        System.out.println("Quantidade de números ímpares inseridos: " + contadorImpares);
        scanner.close();
    }
}
