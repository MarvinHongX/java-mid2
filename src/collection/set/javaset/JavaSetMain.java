package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>()); // 순서 보장 안함
        run(new LinkedHashSet<>()); // 넣은 순서대로
        run(new TreeSet<>()); // 데이터 값 기준으로
    }
    private static void run(Set<String> set) {
        System.out.println("set.getClass() = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
