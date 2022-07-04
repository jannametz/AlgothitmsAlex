import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int index = 1; index <= 7; index++) {
            stack.push(index);
        }
        System.out.println("Stack vor reverse Stack  -> " + stack);
        System.out.println("------------------------------------------------");
        reverseMethodeStack(stack);
        System.out.println("Stack nach reverse Stack -> " + stack);

    }

    // Recursive Funktion zum Einfügen eines Elements am Ende eines bestimmten Stapels
    public static void newStapel(Stack<Integer> stack, int x) {
        if (stack.empty()) { //Wenn der Stapel leer ist, füge das angegebene x unten ein
            stack.push(x);
            return;
        }
        int top = stack.pop(); //Alle Elemente aus dem Stapel holen und im StapelNew halten
        newStapel(stack, x);
        stack.push(top);// //recursion finish , füge alle Elementen in die Aufrufliste ein, an der Spitze des Stapels
    }

    // Rekursive Funktion, um einen g. Stack umzukehren
    public static void reverseMethodeStack(Stack<Integer> stack) {
        if (stack.empty()) { // Stack is leere
            return;
        }
        int x = stack.pop(); // Alle Elemente aus dem Stapel holen und im StapelNew halten
        reverseMethodeStack(stack);
        newStapel(stack, x); //recursion finish , füge alle Elementen in die Aufrufliste ein, ganz unten im Stack
    }
}