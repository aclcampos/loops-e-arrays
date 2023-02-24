import java.util.Scanner;

public class Primeiro_Exercicio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int idade;
    String nome;

    while(true) {
      System.out.println("Nome: ");
      nome = scanner.next();
      if (nome.equals("0")) break;

      System.out.println("Idade: ");
      idade = scanner.nextInt();
     
    }
    
    System.out.println("Continue aqui...");

  }
}