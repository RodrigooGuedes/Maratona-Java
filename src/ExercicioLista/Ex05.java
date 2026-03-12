package ExercicioLista;

import java.util.Scanner;

// 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//  calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. 
// (Base para o Salário mínimo R$ 1.293,20).


public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1293.20;

        System.out.print("Informe o salario do usuario: ");
        double salarioUsuario = scanner.nextDouble();

        double salario = salarioUsuario / salarioMinimo;
        
        System.out.print("Esse usuario recebe: " + salario + " minimos");
        scanner.close();

    }
}
