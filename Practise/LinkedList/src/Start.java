import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Start {

    public static void measureTime(List<Integer> list) {

        /// Блок сравнения добавлений элементов в list
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }

        long end1 = System.currentTimeMillis();
        System.out.println("Add elem: " + list.getClass() + " " + (end1 - start1));

        /// Блок сравнения взятия элемента из list
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            list.get(i);
        }

        long end2 = System.currentTimeMillis();
        System.out.println("Get elem: " + list.getClass() + " " + (end2 - start2));

        ///Блок добавления элемента в начало list
        long start3 = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            list.add(0, i);
        }

        long end3 = System.currentTimeMillis();
        System.out.println("Get pos(0, i) elem: " + list.getClass() + " " + (end3 - start3));
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        measureTime(list1);
        measureTime(list2);

    }
}
