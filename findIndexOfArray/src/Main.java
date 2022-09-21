public class Main {
    public static void main(String[] args) {
        int[] arrayList = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };

        // gesucht the index of 5,7 Positio
        System.out.println("Index Position 5 is: " + suchenIndexOFArray(arrayList, 5));
        System.out.println("Index Position 7 is: " + suchenIndexOFArray(arrayList, 7));
    }
    public static int suchenIndexOFArray(int array[], int temp) {
        if (array == null) { // Null
            return 0;
        }
        for (int i = 0;  i < array.length; i++) {
        if (array[i] == temp) {
            return i;
        } else {
            i = i + 1;
        }
    }
        return 0;
    }
}

