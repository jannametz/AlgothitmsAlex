import java.util.Scanner;
/**/
public class Main {
    public static void main(String[] args) {
                goElevator(4,5);
            }

            public static void goElevator(int curra1, int curra2) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Wähle eine Etage: ");
                int etage = scanner.nextInt();

                if (Math.abs(curra1 - etage) <= Math.abs(curra2 - etage)) {
                    System.out.println("You welcome, first Elevator is coming :D ");
                    curra1 = etage;
                    goElevator(curra1, curra2);

                } else {
                    System.out.println("You welcome, second Elevator is comming: D ");
                    curra2 = etage;
                    goElevator(curra1, curra2);
                }
            }
        }