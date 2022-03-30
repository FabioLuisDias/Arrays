package br.com.dio.bootcamp;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Digite a letra:");
            String letra = scan.next();
            //EqualsIgnoreCase ignora a letra maiuscula da minuscula.
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantConsoantes++;
            }
            count++;
        } while (count < consoantes.length);
        System.out.print("Consoantes:");

        for (String consoante : consoantes) {
            if (consoante != null)//Se houver alguma coisa diferente de null no vetor, imprimir.
                System.out.print(consoante + " ");//Imprime as consoantes.
        }
        System.out.println("\nQuantidade de consoates: " + quantConsoantes); //Imprime a quantidade de consoantes.
    }
}
