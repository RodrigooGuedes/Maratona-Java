package ExercicioLista;

import java.util.Scanner;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
//  deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer
//  um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int a = scanner.nextInt();
        System.out.print("Informe o segundo valor: ");
        int b = scanner.nextInt();

        int c;

        if (a == b) {
            int soma = a + b;
            c = soma;
        }else{
            int multiplicar = a * b;
            c = multiplicar;
        }

        System.out.println("O resultado é: " + c);

        scanner.close();



    }
}
