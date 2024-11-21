package collection.list;

import java.time.*;
import java.util.*;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        int loop = 10_000;

        System.out.printf("\n==ArrayList 추가==\n");
        ArrayList<Integer> arrayList = new ArrayList<>();
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size);
        addLast(arrayList, size);

        System.out.printf("\n==ArrayList 조회==\n");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);

        System.out.printf("\n==LinkedList 추가==\n");
        LinkedList<Integer> linkedList = new LinkedList<>();
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);
        addLast(linkedList, size);

        System.out.printf("\n==LinkedList 조회==\n");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
    }

    private static void addFirst(List<Integer> list, int size) {
        Instant start = Instant.now();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        Instant end = Instant.now();
        System.out.printf("앞에 추가하는데 걸린 시간: %sms\n", Duration.between(start, end).toMillis());
    }

    private static void addMid(List<Integer> list, int size) {
        Instant start = Instant.now();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        Instant end = Instant.now();
        System.out.printf("중간에 추가하는데 걸린 시간: %sms\n", Duration.between(start, end).toMillis());
    }

    private static void addLast(List<Integer> list, int size) {
        Instant start = Instant.now();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        Instant end = Instant.now();
        System.out.printf("뒤에 추가하는데 걸린 시간: %sms\n", Duration.between(start, end).toMillis());
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        Instant start = Instant.now();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        Instant end = Instant.now();
        System.out.printf("index 조회하는데 걸린 시간: %sms\n", Duration.between(start, end).toMillis());
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        Instant start = Instant.now();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        Instant end = Instant.now();
        System.out.printf("value 조회하는데 걸린 시간: %sms\n", Duration.between(start, end).toMillis());
    }
}