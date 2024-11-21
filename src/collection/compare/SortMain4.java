package collection.compare;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        System.out.println("입력 순서");
        System.out.println(list);

        System.out.printf("\nComparable 기본 정렬\n");
        list.sort(null);
        System.out.println(list);

        System.out.printf("\nIdComparator 정렬\n");
        list.sort(new IdComparator());
        System.out.println(list);

        System.out.printf("\nIdComparator 역정렬\n");
        list.sort(new IdComparator().reversed());
        System.out.println(list);
    }
}
