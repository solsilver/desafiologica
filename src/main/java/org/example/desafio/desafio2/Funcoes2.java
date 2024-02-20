package org.example.desafio.desafio2;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Funcoes2 {
    Scanner scaner = new Scanner(System.in);
    private BigDecimal valor;

    public void entradaDeValor() {
        System.out.println("digite o valor");
        scaner.useLocale(Locale.US);
        valor = scaner.nextBigDecimal();
        System.out.println("o valor " + valor);
    }

    public void notasEMoedas() {
        Integer N100 = valor.divide(BigDecimal.valueOf(100.00)).intValue();
        BigDecimal R100 = valor.remainder(BigDecimal.valueOf(100));
        System.out.println(N100 + "nota(s) de R$ 100 ");
        if (R100.doubleValue()!= 0) {
            Integer N50 =  (R100.divide(BigDecimal.valueOf(50)).intValue() );
            BigDecimal R50 = (R100.remainder(BigDecimal.valueOf(50)));
            System.out.println(N50 + "nota(s) de R$ 50 ");
            if (R50.doubleValue() != 0) {
                Integer N20 =  (R50.divide(BigDecimal.valueOf(20)).intValue());
                BigDecimal R20 = (R50.remainder(BigDecimal.valueOf(20)));
                System.out.println(N20 + "nota(s) de R$ 20 ");
                if (R20.doubleValue() != 0) {
                    Integer N10 = (R20.divide(BigDecimal.valueOf(10)).intValue());
                    BigDecimal R10 = (R20 .remainder(BigDecimal.valueOf(10)));
                    System.out.println(N10 + "nota(s) de R$ 10 ");
                    if (R10.doubleValue() != 0) {
                        Integer N5 =  (R10.divide(BigDecimal.valueOf(5)).intValue());
                        BigDecimal R5 = (R10.remainder(BigDecimal.valueOf(5)));
                        System.out.println(N5 + "nota(s) de R$ 5 ");
                        if (R5.doubleValue() != 0) {
                            Integer N2 =  (R5.divide(BigDecimal.valueOf(2)).intValue());
                            BigDecimal R2 = (R5.remainder(BigDecimal.valueOf(2)));
                            System.out.println(N2 + "nota(s) de R$ 2 ");
                            if (R2.doubleValue() != 0) {
                                Integer M1 =  (R2.divide(BigDecimal.valueOf(1)).intValue());
                                BigDecimal RM1 = (R2.remainder(BigDecimal.valueOf(1)));
                                System.out.println(M1 + "Moeda(s) de R$ 1 ");
                                if (RM1.doubleValue() != 0) {
                                    Integer M50 =  (RM1.divide(BigDecimal.valueOf(0.5)).intValue());
                                    BigDecimal RM50 = (RM1.remainder(BigDecimal.valueOf(0.5)));
                                    System.out.println(M50 + "Moeda(s) de R$ 0.50 ");
                                    if (RM50.doubleValue() != 0) {
                                        Integer M25 = (RM50.divide(BigDecimal.valueOf(0.25)).intValue());
                                        BigDecimal RM25 = (RM50.remainder(BigDecimal.valueOf(0.25)));
                                        System.out.println(M25 + "Moeda(s) de R$ 0.25 ");
                                        if (RM25.doubleValue()!= 0) {
                                            Integer M10 =  (RM25.divide(BigDecimal.valueOf(0.10)).intValue());
                                            BigDecimal RM10 = (RM25.remainder(BigDecimal.valueOf(0.10)));
                                            System.out.println(M10 + "Moeda(s) de R$ 0.10 ");
                                            if (RM10.doubleValue() != 0) {
                                                Integer M5 = (int) (RM10.divide(BigDecimal.valueOf(0.05)).intValue());
                                                BigDecimal RM5 = RM10.remainder(BigDecimal.valueOf(0.05));
                                                System.out.println(M5 + "Moeda(s) de R$ 0.05 ");
                                                if (RM5.doubleValue() != 0) {
                                                    Integer MC1 =(RM5.divide(BigDecimal.valueOf(0.01)).intValue());
                                                    BigDecimal RMC1 = (RM5.remainder(BigDecimal.valueOf(0.01)));
                                                    System.out.println(MC1 + "Moeda(s) de R$ 0.01 ");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
