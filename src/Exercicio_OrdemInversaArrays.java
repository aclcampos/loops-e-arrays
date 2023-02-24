public class Exercicio_OrdemInversaArrays {
    public static void main(String[] args) {
        
        int[] vetor = {6, -7, 5, 9, 4, 8};

        System.out.println("Vetor: ");
        int count =0;
       while(count < (vetor.length)) {
        System.out.print(vetor[count] + " ");
        count++; 

       }
       System.out.println("\nVetor: ");
       for( int i = (vetor.length - 1) ; i >= 0; i --)  { 
        System.out.print(vetor[i] + " ");
       }
    }
}
