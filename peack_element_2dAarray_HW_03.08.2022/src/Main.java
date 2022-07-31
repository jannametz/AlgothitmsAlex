public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 45, 7, 12, 10};
        System.out.println("Peak element is " + findPeak(arr) + ".");

    }
        public static int findPeak ( int[] arr, int left, int right){//rekursive
            int mid = (left + right) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) &&
                    (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {// look, ob das mittlere Element größer als seine Nachbarn ist
                return mid;
            }

            if (mid - 1 >= 0 && arr[mid - 1] > arr[mid]) {   // Wenn der linke Nachbar von "mid" größer als das mittlere Element ist,rekursiv im linken Subarray finden
                return findPeak(arr, left, mid - 1);
            }


            return findPeak(arr, mid + 1, right);
        }

        public static int findPeak ( int[] arr){ // Wenn der rechte Nachbar von "mid" größer als das mittlere Element ist, rekursiv im rechten Subarray finden

            if (arr == null || arr.length == 0) {
                System.exit(-1);
            }

            int index = findPeak(arr, 0, arr.length - 1);
            return arr[index];
        }
    }


