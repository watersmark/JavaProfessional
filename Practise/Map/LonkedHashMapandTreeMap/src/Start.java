import java.util.*;

public class Start {
    public static void testMap(Map<Integer, String> map) {

        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Topa");
        map.put(0, "Tim");
        map.put(1500, "Kornak");
        map.put(7, "Bob");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(String.format("%s : %s", entry.getKey(), entry.getValue()));
        }

    }

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        // Значени будут выведены без порядка
        //testMap(hashMap);

        //Значения будут выведены согласно порядку их добавления
        //testMap(linkedHashMap);

        //Значения будут выведены отсортированными по ключу
        testMap(treeMap);
    }
}
