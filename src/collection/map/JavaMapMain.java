package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>()); // 순서 보장하지 않음
        run(new LinkedHashMap<>()); // 입력한 순서 보장
        run(new TreeMap<>()); // 값의 정렬 순서
    }
    private static void run(Map<String, Integer> map) {
        System.out.println(map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        System.out.println("map = " + map);

    }
}
