package ExercicioLista;

import java.util.Scanner;

// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        double reajuste = valor + (valor * 0.05);

        System.out.println("O valor reajustado é: " + reajuste);
        scanner.close();
    }
}
