package atividadeArray.quest2;

import java.util.Scanner;

public class NumerosMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tam = 10;
        int [] numeros = new int[tam];

        for (int i=0;i<tam;i++){
            System.out.println("Digite o "+(i+1)+" número:");
            numeros[i] = sc.nextInt();
        }
        int resultado = Calcular.somar(numeros);
        System.out.println("A soma dos números inseridos é: "+ resultado);

    }
    
}
