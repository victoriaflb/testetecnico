package com.testetecnico.exercises;

import java.util.Scanner;

public class Verificao {

    public static void main(String[] args) {
       
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contagem = contarLetraA(frase);
        if (contagem > 0) {
            System.out.println("A letra 'a' aparece " + contagem + " vez(es) na frase.");
        } else {
            System.out.println("A letra 'a' não aparece na frase.");
        }

        scanner.close();
    }

    public static int contarLetraA(String frase) {
        int contagem = 0;
        for (char letra : frase.toCharArray()) {
            if (letra == 'a' || letra == 'A') {
                contagem++;
            }
        }
        return contagem;
    }
}
