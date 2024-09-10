package com.desafiotarget;

public class Perg4 {

    // 4)

    public static void PercentualEstadoValorTotal() {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double soma = sp + rj + mg + es + outros;

        double representacaoSp = (sp * 100) / soma;
        double representacaoRj =  (rj * 100) / soma;
        double representacaoMg = (mg * 100) / soma;
        double representacaoEs = (es * 100) / soma;
        double representacaoOutros = (outros * 100) / soma;

        System.out.println("Questão 4: ");
        System.out.printf("Sp=%.2f", representacaoSp);
        System.out.printf(" Rj=%.2f", representacaoRj);
        System.out.printf(" Mg=%.2f", representacaoMg);
        System.out.printf(" Es=%.2f", representacaoEs);
        System.out.printf(" Outros=%.2f ", representacaoOutros);
        System.out.println();
        
    }
}
