package ExercicioLista;

import java.util.Arrays;
import java.util.Scanner;

//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int n3 = scanner.nextInt();
        
        int numeros[] = {n1,n2,n3};
        Arrays.sort(numeros);

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
            
        }

        scanner.close();
        
        
    }
}
