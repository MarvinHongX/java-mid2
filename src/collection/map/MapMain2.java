package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap);
        studentMap.put("studentA", 100); // 덮어쓴다.
        System.out.println(studentMap);

        boolean containsA = studentMap.containsKey("studentA");
        System.out.println("containsA = " + containsA);


        // 특정 key의 value 삭제
        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
