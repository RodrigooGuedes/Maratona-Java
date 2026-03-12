package ExercicioLista;

import java.util.Scanner;

// 2 - Faça um algoritmo para receber um número qualquer e imprimir
//  na tela se o número é par ou ímpar, positivo ou negativo.

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        int somaPar = numero % 2;
        
        

        if (somaPar == 0 && numero > 0) {
            System.out.println("Esse número é par e positivo");
        }if (somaPar == 0 && numero < 0) {
            System.out.println("Esse número é par e negativo");
        }if (somaPar != 0 && numero > 0) {
            System.out.println("Esse número é impar e positivo");
        }if (somaPar != 0 && numero < 0) {
            System.out.println("Esse número é impar e negativo");
        }
        scanner.close();

    }
}
