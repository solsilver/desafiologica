package org.example.desafio.desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcoes4 {
    private static Scanner scan = new Scanner(System.in);
    private static Integer numeroCasosTeste;
    private static List<String> casosTestes = new ArrayList<>();

    public  void entradaDaString(){
        System.out.println("Digite o número de casos de teste: ");
        numeroCasosTeste = scan.nextInt();
        System.out.println("Digite os casos de teste: ");
        scan.nextLine(); //limpar o buffer
        for(int i = 0; i < numeroCasosTeste; i++){
            casosTestes.add(scan.nextLine());
        }
    }

    public  void desembaralhaPalavras(){
        for(int i = 0; i < numeroCasosTeste; i++){
            String auxiliar = casosTestes.get(i);
            String primeiraParte = auxiliar.substring(0, (auxiliar.length()/2));
            String segundaParte = auxiliar.substring((auxiliar.length()/2));
            String primeiraParteInvertida = new StringBuilder(primeiraParte).reverse().toString();
            String segundaParteInvertida = new StringBuilder(segundaParte).reverse().toString();
            System.out.println(primeiraParteInvertida + segundaParteInvertida);
        }
    }


}

