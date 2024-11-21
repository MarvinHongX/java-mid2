package collection.list;

import java.time.Duration;
import java.time.Instant;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        int loop = 10_000;

        System.out.printf("\n==MyArrayList 추가==\n");
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);
        addLast(arrayList, size);

        System.out.printf("\n==MyArrayList 조회==\n");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);

        System.out.printf("\n==MyLinkedList 추가==\n");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);
        addLast(linkedList, size);

        System.out.printf("\n==MyLinkedList 조회==\n");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
    }

    private static void addFirst(MyList<Integer> list, int size) {
        Instant start = Instant.now();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        Instant end = Instant.now();
        System.out.printf("앞에 추가하는데 걸린 시간: %sms\n", Duration.between(start, end).toMillis());
    }

    private static void addMid(MyList<Integer> list, int size) {
        Instant start = Instant.now();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        Instant end = Instant.now();
        System.out.printf("중간에 추가하는데 걸린 시간: %sms\n", Duration.between(start, end).toMillis());
    }

    private static void addLast(MyList<Integer> list, int size) {
        Instant start = Instant.now();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        Instant end = Instant.now();
        System.out.printf("뒤에 추가하는데 걸린 시간: %sms\n", Duration.between(start, end).toMillis());
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        Instant start = Instant.now();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        Instant end = Instant.now();
        System.out.printf("index 조회하는데 걸린 시간: %sms\n", Duration.between(start, end).toMillis());
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        Instant start = Instant.now();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        Instant end = Instant.now();
        System.out.printf("value 조회하는데 걸린 시간: %sms\n", Duration.between(start, end).toMillis());
    }
}