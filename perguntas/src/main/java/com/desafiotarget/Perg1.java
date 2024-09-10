package com.desafiotarget;

public class Perg1 {

    // 1)

    public static void LoopSoma() {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while(k < indice) {
            k++;
            soma = soma + k;
        }
       
        System.out.println("Questão 1: ");
        System.out.println(soma);
    }
}
