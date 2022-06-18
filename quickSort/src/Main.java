import  java.util.Arrays;

/*I.Quick sort
1.Выбираем опорный элемент из массива. Как правило, это средний элемент pivot.
2.Делим массив на 2 подмассива. Элементы, которые меньше опорного, и элементы, которые больше опорного.
3.Рекурсивно применяем сортировку к обоим подмассивам.
В результате массивы будут делиться до тех пор, пока не останется один элемент, который потом отсортируется.

II. Провести асимптотический анализ – сложность алгоритма = O(?)
*/
public class Main {


    public static void main(String[] args) {
        int[] input = new int[]{2, 6, 7, 3, 5, 7, 8, 8, 1, -1, 14, 5, 7};
        System.out.println("Befor sort Array: ");
        System.out.println(Arrays.toString(input));
        int n = input.length;
        QuickSort.quickSort(input, 0, n - 1);
        System.out.println("After sort Array: ");
        System.out.println(Arrays.toString(input));
    }
}
// in this Algorithmus time Complexity is O(n*log n)!
 

/* The quick sort is a divide and conquer algorithm.
Quicksort Complexity
Time Complexity
Best	       O(n*log n)
Worst	       O(n2)
Average	       O(n*log n)
Space Complexity	       O(log n)
Der Ansatz des Divide-and-Conquer lässt sich auf Probleme anwenden, die sich auf die folgende Weise lösen lassen:
1.	Das Problem in Teilprobleme aufteilen. (divide)
2.	Die einzelnen Teilprobleme (in der Regel rekursiv) unabhängig voneinander
lösen.
3.	Die erhaltenen Lösungen der Teilprobleme zu einer Gesamtlösung zusammen-
setzen. (conquer)
 */
// weitere Beschreibung und Beweis(proof) folgt