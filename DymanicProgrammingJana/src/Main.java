import java.util.Arrays;

public class Main {

            public static void main(String[] args) {

                int num = 7;
                int[] arr = new int[num + 1]; // massiv
                arr[1] = 1;
                for (int i = 2; i <= num; i++) {
                    //arr[i] = -1;
                    arr[i] = arr[i - 2] + arr[i - 1];
                }
                System.out.println(Arrays.toString(arr));// array ausdrücken
                System.out.println(fibonacciRecursion(num));
                System.out.println(fibonacciDpMemoization(num, arr));
                System.out.println(fibonacciDpTabulation(num));

                long time = System.nanoTime();
                fibonacciRecursion(num);//klasische funktion welhce wollen wir besser machen
                System.out.println("Classic recursion --> " + (System.currentTimeMillis() - time));
                fibonacciDpMemoization(num, arr); // xranilige
                System.out.println("Memoization --> " + (System.nanoTime() - time));
                time = System.nanoTime();
                fibonacciDpTabulation(num);
                System.out.println("Tabulation --> " + (System.nanoTime() - time));

            }
            private static int fibonacciRecursion(int num) {
                if (num < 2) {
                    return 1;
                }
                return fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2);
            }

            private static int fibonacciDpMemoization(int num, int[] arr) { // num zahl fibonacci, und Array, geht von oben
                if (num < 2) {
                    return 1;
                }

              /*  if (arr[num] != -1) { // wenn ich mit diesen Function schon gearbeitet hat und wenn es nicht = -1 , dann exsist es schon diese znahenie
                    return arr[num];
                }*/

                arr[num] = fibonacciDpMemoization(num - 1, arr) + fibonacciDpMemoization(num - 2, arr);//rekursion yslovia, arr peredaha arrays
                return arr[num];
            }

            private static int fibonacciDpTabulation(int num) { // geht von unten
                int[] arr = new int[num+1];
                arr[0] = 1;//
                arr[1] = 1;//  first  index liegen 1

                int res = 0;// result = 0;
                for (int index = 2; index <= num; index++) {
                    arr[index] = arr[index - 2] + arr[index - 1];

                    if (index == num) {//  index dostig poslednei jaheiki,
                        res = arr[index];//  result array letzte index
                    }
                }
                return res;
            }
        }
