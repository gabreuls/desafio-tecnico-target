package com.desafiotarget;

public class Perg3 {

    // 3)

    double[] faturamentoDiario = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 
                                  26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722,
                                  0.0, 0.0, 3847.4823, 373.7838, 2659.7563,
                                  48924.2448, 18419.2614, 0.0, 0.0, 35240.1826,
                                  43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0,
                                  0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};

    public void CalcularFaturamento() {
        double menorValor = CalcularMenorValor();
        double maiorValor = CalcularMaiorValor();
        int diasAcimaMedia = CalcularDiasAcimaMedia();

        System.out.println("Questão 3: ");
        System.out.printf("Menor Valor=%.2f", menorValor);
        System.out.printf(" Maior Valor=%.2f", maiorValor);
        System.out.printf(" Dias acima da Média=%d ", diasAcimaMedia);
        System.out.println();
    }

    public double CalcularMenorValor() {
        double menorValor = faturamentoDiario[0];

        for(double valor : faturamentoDiario) {
            if(valor < menorValor && valor != 0.0) {
                menorValor = valor;
            }
        }

        return menorValor;
    }

    public double CalcularMaiorValor() {
        double maiorValor = faturamentoDiario[0];
        for(double valor : faturamentoDiario) {
            if(valor > maiorValor) {
                maiorValor = valor;
            }
        }

        return maiorValor;

    }

    public int CalcularDiasAcimaMedia() {

        double soma = 0.0;
        int diasUteis = 30;
        for(double valor : faturamentoDiario) {
            if(valor == 0.0) {
                diasUteis --;
            }
            soma += valor;
        }

        double mediaMensal = soma / diasUteis;

        int contador = 0;
        for(double valorDia : faturamentoDiario) {
            if(valorDia > mediaMensal) {
                contador++;
            }
        }

        return contador;
    }

}
