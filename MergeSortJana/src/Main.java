import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] arr = {5, 41, 83, 51, 7, 89, 14};
        System.out.println(Arrays.toString(arr));//ausdrücken vorher
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));//ausdrücken nachher
    }

    private static void mergeSort(int[] arr) {
        int lengthArray = arr.length; // length array
        if (lengthArray == 1) {// ende der recurcion, unsere length hat 1 erreicht
            return;
        }
        int mid = lengthArray / 2;// middle index from array
        int[] lArray = new int[mid]; //links pod array
        int[] rArray = new int[lengthArray - mid]; // right pod array new
        // Copy element from arry to pod array и
        for (int i = 0; i < mid; i++) {
            lArray[i] = arr[i];//copy from arr to pod array->links array
        }
        for (int k = mid; k < lengthArray; k++) {
            rArray[k - mid] = arr[k];
        }
        mergeSort(lArray);
        mergeSort(rArray);

        // когда мы достигли базового условия
        int left_size = 0;
        int right_size = 0;
        merge(arr, lArray, rArray);

    }

    private static void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int leftArrLength = leftArray.length;
        int rightArrLength = rightArray.length;
        // copy index pod array
        int leftI = 0;
        int rigthI = 0;
        // copy index in array
        int arrIndex = 0;
        while (leftI < leftArrLength && rigthI < rightArrLength) {
            if (leftArray[leftI] < rightArray[rigthI]) { // compare element to links and rigth pod array
                arr[arrIndex] = leftArray[leftI]; // if the condition is true, then the element in the left is less, save it
                // to 0 cell of the main array
                leftI++;
                arrIndex++;
            } else {
                arr[arrIndex] = rightArray[rigthI];
                rigthI++;
                arrIndex++;
            }
        }
        // copy element from links
        while (leftI < leftArrLength) {
            arr[arrIndex] = leftArray[leftI];
            leftI++;
            arrIndex++;
        }
        // copy element from rechts
        while (rigthI < rightArrLength) {
            arr[arrIndex] = rightArray[rigthI];
            rigthI++;
            arrIndex++;
        }
    }
}
