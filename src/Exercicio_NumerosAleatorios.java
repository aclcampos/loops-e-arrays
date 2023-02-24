import java.util.Random;

public class Exercicio_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeroAleatorios = new int[20]; 

        for( int i = 0; i < numeroAleatorios.length; i++){ 
            int numero = random.nextInt(100);
            numeroAleatorios[i] = numero; 
        }
        System.out.print("Numeros Aleatorios: ");
        for (int numero : numeroAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numeroAleatorios) {
        System.out.println((numero+1) + " "); 
    }

}
}
