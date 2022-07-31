public class Main {
    /* 1. Даны два целых числа x и n, напишите функцию для вычисления x^n
     решение 1 - рекурсивно O(n)
     решение 2 - улучшить решение 1 до O(lon n)
     решение 1 --> вычисления функции f ( n ) = x^n
      x^n = x * x^n-1
      x^0 = 1
     решение 2 --> вычисления функции f ( n ) = x^n
     x^n = x....x^n-1, if n Чётные
     x^n = (x^n/2)^2, if n Не четные
      */
    public static void main(String[] args) {
        int x, n;
        System.out.println("Pекурсивно O(n) -> " + power(2, 10));
        System.out.println("Better решение 1 до O(lon n) -> " + power1(2, 8));
    }

    public static int power(int x, int n) { // решение 1 - рекурсивно O(n)
       if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return power(1 / x, -n);
        }
        return x * power(x, n - 1);
       // return (n == 1) ? x : (x * power(x, n - 1));
    }
    public static int power1(int x, int n) { // решение 2 - улучшить решение 1 до O(lon n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return power1(1 / x, -n);
        }
        if (n % 2 == 1) {
            return x * power1(x, n - 1);
        }
        return power1(x * x, n / 2);
    }
}