package ExercicioLista;
import java.util.Scanner;

//10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        double soma = 0;
        do {
            System.out.println("Digite a nota do " + (contador) + " aluno: ");
            double nota = scanner.nextDouble();
            soma += nota;
            
            
          
            contador++;
        } while (contador <= 3);
        double media = soma / (contador - 1);
        System.out.println("A média do aluno foi: " + media);
        
        scanner.close();
        
    }
}
