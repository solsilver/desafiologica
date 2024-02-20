package org.example.desafio.desafio3;

import java.util.*;

public class Funcoes3 {
    Scanner scaner = new Scanner(System.in);
    private Integer valorAlvo;
    private List<Integer> numeros = new ArrayList<>();
    private Integer tamanho;

    ;


    public void selecionarValorAlvo() {
        System.out.println("digite o valor alvo");
        valorAlvo = scaner.nextInt();
        System.out.println("o valor alvo é " + valorAlvo);
    }

    public void selecionarTamanhoArray() {
        System.out.println("digite o numero de linhas");

        tamanho = scaner.nextInt();

        System.out.println("digite o tamanho do vetor " + tamanho);
    }

    public void digitarNumeros3() {
        System.out.println("digite os numeros ");

        for (Integer i = 0; i < tamanho; i++) {
            numeros.add(scaner.nextInt());
            System.out.println("o numero de linhas é " +numeros);
        }

        Collections.sort(numeros);
        System.out.println("o numero de linhas é " + numeros);
    }
    public void procurarPares() {
        System.out.println("digite os numeros ");

        for (Integer i = 0; i < tamanho; i++) {
            numeros.add(scaner.nextInt());
            System.out.println("o numero de linhas é " +numeros);
        }


        System.out.println("o numero de linhas é " + numeros);
    }
    private Integer fatorial( Integer fatorial){
         Integer mult=1;
        for(Integer i=fatorial ; i>=1 ; i--){
            mult= mult * i;
        }
        return mult;
    }

    private Integer numeroPossibilidades(){

        Integer fattamanho= fatorial(tamanho);
        Integer Dfattamanho= (fatorial(2)*fatorial(tamanho - 2));
        Integer poss= fattamanho/Dfattamanho;
        return poss;
    }
    public void numerodepares(){
        Integer nDP = 0;
        Integer nP= numeroPossibilidades();
        Collections.sort(numeros, Collections.reverseOrder());
         Integer a=0;

        for (Integer i = 0; i < nP; i++) {
            Integer b = a + 1;
            for (Integer j=a ; j<tamanho-1 ; j++){

                Integer z=numeros.get(a);
                Integer w=numeros.get(b);
               if(z-w==valorAlvo) {

                    nDP = nDP + 1;
               }
               b = b+1;
            }
            a=a+1;


        }
        System.out.println("o numero de combinações é " +nDP);
    }


}
