
package com.mycompany.numerospares;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int N = scanner.nextInt();

        int numero = 2;
        System.out.println("Números pares de 1 a " + N + ":");
        while (numero <= N) {
            System.out.print(numero + " ");
            numero += 2;
        }

        scanner.close();
    }
}
