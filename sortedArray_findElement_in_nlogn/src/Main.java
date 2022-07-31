import java.util.*;


public class Main {
    /*
    Имея отсортированный массив arr[] и число x,
    напишите функцию, которая подсчитывает вхождения x в arr[].
    Ожидаемая временная сложность O(Log n)
    arr[] = {1, 1, 2, 2, 2, 2, 3,}
    x = 2
    Вывод: 4 раза
    каждый проход цикла: деление пополам справа - слева
    ⇒ O (log (n))
    */
    public static void main(String[] args) {
        int[] x = {1, 1, 2, 2, 2, 2, 3};
        int finish = 2;
        int first = findCount(x, finish, true);
        int last = findCount(x, finish, false);
        int zusammen = last - first + 1;
        if (first != -1) {
            System.out.println("Element x=" + finish + " found " + zusammen + " mal. ");
        } else {
            System.out.println("No Element in the Array. ");
        }
    }

    public static int findCount(int[] x, int finish, boolean searchElement) {
        int left = 0; // Область поиска (лево … право)
        int right = x.length - 1;//Область поиска (лево … право)
        int res = -1;
        while (left <= right) {
            int middle = (left + right) / 2; //находит среднее значение в oбласти поиска и сравнивает его с целевым
            if (finish == x[middle]) { //Если finish найден, обновить результат
                res = middle;
                if (searchElement) { //нижние индексы искать дальше
                    right = middle - 1;
                } else { // Верхние индексы искать далее
                    left = middle + 1;
                }
            } else if (finish < x[middle]) {//Если finish < среднего элемента, отбрасываем правую половину
                right = middle - 1;
            } else { //Если finish > среднего элемента, отбрасываем левую половину
                left = middle + 1;
            }
        }
        return res;
    }
}