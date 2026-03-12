package ExercicioLista;
import java.util.Scanner;

//9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura
//  e imprima na tela sua condição de acordo com a tabela abaixo:
//Fórmula do IMC = peso / (altura) ²
//Tabela Condições IMC


//Abaixo de 18,5   | Abaixo do peso          

 //Entre 18,6 e 24,9 | Peso ideal (parabéns)  

 //Entre 25,0 e 29,9 | Levemente acima do peso

 //Entre 30,0 e 34,9 | Obesidade grau I 

 //Entre 35,0 e 39,9 | Obesidade grau II (severa)

 //Maior ou igual a 40 | Obesidade grau III (mórbida)

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu peso kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Informe sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Parabens peso ideal");
        }else if (imc >= 25 && imc <=29.9) {
            System.out.println("Levemente acima do peso");
        }else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        }else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2 (severa)");
        }if (imc >= 40) {
            System.out.println("Obesidade grau 3 (mórbia)");
        }

        scanner.close();

        
    }
}
