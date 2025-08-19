
/*
 * O algoritmo a seguir (que não utiliza divisão-e-conquista) encontra o maior valor em um vetor.
1,
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

import java.lang.Math;
import java.util.Random;

public class App2 {

    public static int counter = 0;

    public static void main(String[] args) {
        int length = 1000;

        Random r = new Random();

        long[] arr = new long[length];
        for(int i =0; i < length; i++) arr[i] = (long)r.nextInt(100);
        long result = maxVal1(arr);

        System.out.println("\nsem Div e Conq");
        System.out.println("Contagem: " + counter);
        System.out.println("Resultado: " + result);

        counter = 0;

        System.out.println("\ncom Div e Conq");

        result = maxVal2(arr, 0, length - 1);
        System.out.println("Contagem: " + counter);
        System.out.println("Resultado: " + result);

    }

    public static long maxVal1(long A[]) {
        long max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
            counter++;
        }
        return max;
    }

    public static long maxVal2(long A[], int init, int end) {
        counter++;
        if (end - init <= 1)
        return Math.max(A[init], A[end]);
        else {
            int m = (init + end) / 2;
            long v1 = maxVal2(A, init, m);
            long v2 = maxVal2(A, m + 1, end);
            return Math.max(v1, v2);
        }
    }
}
