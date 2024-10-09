package com.testetecnico.exercises;


public class Fibonacci {

    public static void main(String[] args) {
       
         System.out.println("\n");
        
        int numero = 13;

        if(pertenceSequenciaFibonacci(numero)){
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
        }else{
            System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");
        }

       
}

public static boolean pertenceSequenciaFibonacci(int n){
    int a = 0, b = 1;

    if(n == a || n == b){
        return true;
    }

    while (b < n) {
        int proximo = a + b;
        a = b;
        b = proximo;

        if (b == n) {
            return true;
        }
    }

    return false;
}



}