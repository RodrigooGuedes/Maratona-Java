package ExercicioLista;

import java.util.Scanner;

//1 - Faça um algoritmo que leia os valores de A, B, C
//  e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        int soma = a + b;

        if (soma < c) {
            System.out.println("A soma de A e b deu: " + soma + "e foi menor que C : " + c);
        }if (soma >=c) {
            System.out.println("A soma foi maior");
            
        }
        scanner.close();
    }
}
