

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * - implemente o algortimo abaixo;
 * teste-o para vetores de inteiros com conteúdos randômicos, e tamanho 32, 2048
 * e 1.048.576. Nestes testes, contabilize o número de iterações que o algoritmo
 * executa, e o tempo gasto;
 * MERGE-SORT(L: List with n elements) : Ordered list with n elements
 * IF (list L has one element)
 * RETURN L.
 * Divide the list into two halves A and B.
 * A ← MERGE-SORT(A).
 * B ← MERGE-SORT(B).
 * L ← MERGE(A, B).
 * RETURN L.
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(15);
        arr.add(4);
        arr.add(70);
        arr.add(3);
        arr.add(25);
        System.out.println(mergeSort(arr));
    }


    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        while (!a.isEmpty() || !b.isEmpty()) {
            if(a.isEmpty()) {
                result.add(b.remove(0));
                continue;
            }
            if(b.isEmpty()) {
                result.add(a.remove(0));
                continue;
            }
            if(a.get(0) < b.get(0)) {
                result.add(a.remove(0));
            } else {
                result.add(b.remove(0));
            }
        }
        return result;
    }
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> array) {
        if(array.isEmpty()) return null;
        if(array.size() == 1) return array;
        int half = array.size() / 2;
        ArrayList<Integer> a = mergeSort(new ArrayList<>(array.subList(0,half)));
        ArrayList<Integer> b = mergeSort(new ArrayList<>(array.subList(half, array.size())));
        return merge(a, b);

    }
}
