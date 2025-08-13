

/*
 * O algoritmo a seguir (que não utiliza divisão-e-conquista) encontra o maior valor em um vetor.

Assim, novamente:

implemente o algortimo abaixo;
teste-o para vetores de inteiros com conteúdos randômicos, e tamanho 32, 2048 e 1.048.576. Nestes testes, contabilize o número de iterações que o algoritmo executa, e o tempo gasto;
long maxVal1(long A[], int n) {  
    long max = A[0];
    for (int i = 1; i < n; i++) {  
        if( A[i] > max ) 
           max = A[i];
    }
    return max;
}
 */

/**
 *
 * @author piedr
 */
public class App2 {

    public static int counter = 0;
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5, 6};
        long result = maxVal1(arr);
        System.out.println(counter);
    }

    public static long maxVal1(long A[]) {  
    long max = A[0];
    for (int i = 1; i < A.length; i++) {  
        if( A[i] > max ) 
            max = A[i];
        counter++;
    }
    return max;
}
}
