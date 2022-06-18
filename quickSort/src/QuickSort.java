
public class QuickSort {
   static int partition(int []array, int begin, int end) {  // method to find the partition position
       int pivot = array[end]; // choose the rightmost element as pivot
       int i = (begin - 1);  // pointer for greater element
       for (int j = begin; j < end; j++) {   // traverse through all elements, compare each element with pivot
           if (array[j] <= pivot) {
               i++;// if element smaller than pivot is found, swap it with the great element pointed by i
               int temp = array[i];  // swapping element at i with element at j
               array[i] = array[j];
               array[j] = temp;
           }
       }
       // swap the pivot element with the greater element specified by i
       int temp = array[i + 1];
       array[i + 1] = array[end];
       array[end] = temp;
       return (i + 1);   // return the position from where partition is done
   }
    static void quickSort(int []array, int begin, int end) {
        if (begin < end) {
            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, begin, end);
            quickSort(array, begin, pi - 1); // recursive call on the left of pivot
            quickSort(array, pi + 1, end);// recursive call on the right of pivot
        }
    }
}
