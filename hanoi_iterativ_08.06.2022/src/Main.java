

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = user.nextInt();
        hanoi_iterativ(n);
    }

    public static void hanoi_iterativ(int n) {

        int move, two = 0, three, positionTwo, positionThree, j, i = 1;
        int[] standorte = new int[n + 2];
        for (j = 0; j < n; j++) {
            standorte[i] = 0;
        }
        standorte[n + 1] = 2;
        move = 1;
        for (i = 1; i <= n; i++) {
            move *= 2;
            move -= 1;
            for (i = 1; i <= move; i++) {
                if (i % 2 == 1) {
                    two = standorte[1];
                    standorte[1] = (standorte[1] + 1) % 3;
                    System.out.println("Move disk one to " + (char) ('A' + standorte[1]));
                } else {
                    three = 3 - two - standorte[1];
                    positionTwo = n + 1;
                    for (j = n + 1; j >= 2; j--) {
                        if (standorte[j] == two) {
                            positionTwo = j;
                        }
                    }
                    positionThree = n + 1;
                    for (j = n + 1; j >= 2; j--) {
                        if (standorte[j] == three) {
                            positionThree = j;
                        }
                    }
                    System.out.println("Move disk ");
                    if (positionTwo < positionThree) {
                        System.out.println(positionTwo + "to" + (char) ('A' + three));
                        standorte[positionTwo] = three;
                    } else {
                        System.out.println(positionThree + "to" + (char) ('A' + two));
                        standorte[positionThree] = two;
                    }
                }
            }
        }
    }
}