package atividadeArray.quest1;


import java.util.Arrays;
import java.util.Scanner;

public class NomeMain {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      String [] nomes = new String[10];

      for( int i=0; i<nomes.length;i++){
        System.out.println("Digite o nome do aluno "+ (i+1)+":");
        nomes[i] = sc.nextLine();
      }
      
      Arrays.sort(nomes);

      System.out.println("Nomes inseridos em ordem alfabética: ");
      for (String nome : nomes) {
        System.out.println(nome);
        
      }

    }
    
}

