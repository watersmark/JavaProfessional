import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        list1 = new LinkedList<Integer>();

        for (int i = 0; i < 100; i++) {
            list1.add(i);
        }

        // Так можно вывести все элементы ArrayList без цикла
        System.out.println(list1);

        // Получение элемента по индексу
        System.out.println(list1.get(0));
        System.out.println(list1.get(99));

        // Пройтись по всем элементам ArrayList(не рассматриваем lambda function)
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

        System.out.println();

        for(Integer elem : list1){
            System.out.print(elem + " ");
        }

        // Удаление элемента
        list1.remove(6);
    }
}