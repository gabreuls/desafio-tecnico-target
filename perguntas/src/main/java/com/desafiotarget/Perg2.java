package com.desafiotarget;

import java.util.ArrayList;
import java.util.List;

public class Perg2 {

        // 2)

        public static void TemEmFibonacci() {
            int n = 100;
        
            List<Integer> fibonacci = new ArrayList<>();
            fibonacci.add(0);
            fibonacci.add(1);

            int proxNumero = 1;

            while(proxNumero <= n) {
                fibonacci.add(proxNumero);
                int tam = fibonacci.size();
                proxNumero = fibonacci.get(tam - 1) + fibonacci.get(tam - 2);
            }

            System.out.println("Questão 2: ");
            if(fibonacci.contains(n)) {
                System.out.println("Número está presente na sequência de Fibonacci");
            } else {
                System.out.println("Número não está presente na sequência de Fibonacci");
            }
        }
}
