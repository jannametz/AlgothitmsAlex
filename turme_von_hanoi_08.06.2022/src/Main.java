
import java.io.*;


public class Main {
    public static void main(String[] args) {
        hanoi_rekursiv(3, 'A', 'B', 'C'); //
        //hanoi_iterativ(3);
        System.out.println("--------------------------------------");
    }

    public static void hanoi_rekursiv(int n, char from, char to, char nach) {
        if (n == 1) {
            System.out.println("Move disk from stick " + from + " to stick " + to);
        } else {
            hanoi_rekursiv(n - 1, from, nach, to);
            hanoi_rekursiv(1, from, to, nach);
            hanoi_rekursiv(n - 1, nach, to, from);
        }
    }
}