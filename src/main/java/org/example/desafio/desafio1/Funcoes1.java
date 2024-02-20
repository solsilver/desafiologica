package org.example.desafio.desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Funcoes1 {
    Scanner scaner = new Scanner(System.in);
    private Integer numeroDeLinhas;
    private List<Integer> numeros = new ArrayList<>();
    private List<Integer> numerosPar = new ArrayList<>();
    private List<Integer> numerosImpar= new ArrayList<>();
    private Integer p = 0;
    private Integer im = 0;

    public void entradaDeLinhas() {
        System.out.println("digite o numero de linhas");
        numeroDeLinhas = scaner.nextInt();

    }
    public void digitarnumeros(){
        System.out.println("digite os numero ");

        for(Integer i=0; i<numeroDeLinhas ;i++ ){
        numeros.add(scaner.nextInt());
        System.out.println("o numero de linhas é " +numeros);
        }


        for(Integer i=0; i<numeroDeLinhas ;i++ ){
            Integer N= numeros.get(i);
            System.out.println("o numero é " +numeros);
            if((N%2) ==0){
                numerosPar.add(p,N);

                p=p+1;
            }
            if((N%2) !=0){
                numerosImpar.add(im , N);

                im = im+1;
            }
            Collections.sort(numerosPar);

            Collections.sort(numerosImpar,Collections.reverseOrder());

            for(Integer k=0; k<numerosPar.size() ;k++ ){
                System.out.println(numerosPar.get(k));
            }
            for(Integer k=0; k<numerosImpar.size() ;k++ ){
                System.out.println(numerosImpar.get(k));
            }

        }

    }

}
