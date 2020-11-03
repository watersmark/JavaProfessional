import java.util.HashMap;
import java.util.Map;

public class Start {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(3, "Новое значние");


        // Пройтись по всем элементам Map<>
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " +  entry.getValue());
            entry.setValue("six");
        }

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("два"));
        System.out.println(map.hashCode());

    }
}
