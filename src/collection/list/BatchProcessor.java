package collection.list;

import java.time.Duration;
import java.time.Instant;

public class BatchProcessor {
//    private final MyArrayList<Integer> list = new MyArrayList<>();
//    private final MyLinkedList<Integer> list = new MyLinkedList<>(); // 구체적인 것에 의존하는 문제점
    private final MyList<Integer> list; // 추상적인 것에 의존하고, 의존관계 주입(Dependency Injection)을 활용

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        Instant start = Instant.now();
        for (int i = 0; i < size; i++) {
            list.add(0, i); // 앞에 추가
        }
        Instant end = Instant.now();
        System.out.println("size " + size + " = " + Duration.between(start, end).toMillis());
    }
}
