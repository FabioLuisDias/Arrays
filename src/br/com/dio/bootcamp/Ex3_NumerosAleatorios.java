package br.com.dio.bootcamp;

import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatórios
 (entre 0 a 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
 */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //Gera números aleatórios

        int[] numeroAleatorios = new int[20];

        for(int i = 0; i < numeroAleatorios.length ; i++ ){
            int numero = random.nextInt(100);//Limita até o número 100
            numeroAleatorios[i] = numero;
        }

        System.out.println("Números Aleatórios:");
        for (int numero : numeroAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos Números Aleatórios:");
        for (int numero : numeroAleatorios) {
            System.out.print(numero+ 1 + " ");
        }
    }
}
