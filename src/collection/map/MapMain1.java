package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);

        // 특정 key의 value 조회
        Integer resultD = studentMap.get("studentD");
        System.out.println("resultD: " + resultD);

        // keyset 활용: Map의 키는 중복을 허용하지 않음
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            System.out.println(key + ": " + studentMap.get(key));

        }

        // values 활용
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        // entryset 활용: 키와 값을 묶어서 저장할 때 Entry라는 객체를 이용함.
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
