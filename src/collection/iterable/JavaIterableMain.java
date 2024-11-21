package collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        printAll(list.iterator());
        printAll(set.iterator());

        foreach(list);
        foreach(set);
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println(iterator.getClass().getName());
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    private static void foreach(Iterable<Integer> collection) {
        System.out.println(collection.getClass().getName());
        for (Integer integer : collection) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
