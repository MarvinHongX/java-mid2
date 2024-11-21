package collection.compare;

import java.util.Set;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        Set<MyUser> set1 = new TreeSet<>();
        set1.add(user1);
        set1.add(user2);
        set1.add(user3);
        System.out.printf("\nComparable 기본 정렬\n");
        System.out.println(set1);

        Set<MyUser> set2 = new TreeSet<>(new IdComparator());
        set2.add(user1);
        set2.add(user2);
        set2.add(user3);
        System.out.printf("\nIdComparator 정렬\n");
        System.out.println(set2);

        Set<MyUser> set3 = new TreeSet<>(new IdComparator().reversed());
        set3.add(user1);
        set3.add(user2);
        set3.add(user3);
        System.out.printf("\nIdComparator 역정렬\n");
        System.out.println(set3);
    }
}
