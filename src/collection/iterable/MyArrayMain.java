package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        System.out.printf("iterator 사용\n");
        Iterator<Integer> iterator = myArray.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.printf("\nfor-each 사용\n");
        // 자바는 Iterable 인터페이스를 구현한 객체에 대해서 향상된 for문을 사용할 수 있게 해준다.
        for (Integer i : myArray) {
            System.out.print(i + " ");
        }
    }
}
