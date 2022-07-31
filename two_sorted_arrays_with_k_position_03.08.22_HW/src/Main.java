import java.util.Arrays;


public class Main {
    /*
    Имея два отсортированных массива размера m и n соответственно,
    вам нужно найти элемент, который будет находиться на k-й позиции
    в конечном отсортированном массиве.
    Массив 1 - 100 112 256 349 770
    Массив 2 - 72 86 113 119 265 445 892
    к = 7
    Вывод : 256
    Окончательный отсортированный массив -
    72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
    7-й элемент этого массива равен 256.
    */

    public static void main(String[] args) {

        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int [] arr3 = {72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892};
        int[] arr = new int [arr1.length + arr2.length];

        System.out.println("Array one: " + Arrays.toString(arr1));
        System.out.println("Array two: " + Arrays.toString(arr2));
        System.out.println("Position Index k=" + findIndex(arr3,119));
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            arr[k++] = arr1[i++];}
            while (j < arr2.length) {
                arr[k++] = arr2[j++];
        }
     System.out.println("Concatenated Array: " + Arrays.toString(arr));
    }


       public static int findIndex( int arr[], int k){
           int i = Arrays.binarySearch(arr, k);
           return (i < 0) ? -1 : i;
        }
}
