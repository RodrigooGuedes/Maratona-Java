package ExercicioLista;

import java.util.Scanner;

//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int a = scanner.nextInt();
        int antecessor = a -1;
        int sucessor = a +1;
        System.out.println("O antecessor de: " + a + " é " + antecessor + ", e o sucessor é " + sucessor);
        scanner.close();


    }
}
