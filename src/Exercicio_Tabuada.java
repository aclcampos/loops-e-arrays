import java.util.Scanner;

public class Exercicio_Tabuada {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        

        System.out.println("Tabuada ");
        int tabuada =  scanner.nextInt(); 

        System.out.println("Tabuada de " + tabuada);
        for(int i = 1 ; i <= 10 ; i++) {
            System.out.println(tabuada + "x" + i + "=" + (tabuada*i));

        }
    }

}
