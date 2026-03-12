package ExercicioLista;

import java.util.Scanner;

//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double b = scanner.nextDouble();

        boolean verdadeiroOuFalso;

        if (a == b) {
            verdadeiroOuFalso = true;
            System.out.println(verdadeiroOuFalso);
            
        }if (a != b) {
            verdadeiroOuFalso = false;
            System.out.println(verdadeiroOuFalso);
        }
        scanner.close();

        
        
        
    }
}
