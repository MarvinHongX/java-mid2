package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("A", 30);
        MyUser user2 = new MyUser("C", 10);
        MyUser user3 = new MyUser("B", 24);
        MyUser[] users = {user1, user2, user3};
        System.out.print("입력 순서\n");
        System.out.println(Arrays.toString(users));

        System.out.printf("\nComparable 기본 정렬\n");
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        System.out.printf("\nIdComparator 정렬\n");
        Arrays.sort(users, new IdComparator());
        System.out.println(Arrays.toString(users));

        System.out.printf("\nIdComparator 역정렬\n");
        Arrays.sort(users, new IdComparator().reversed());
        System.out.println(Arrays.toString(users));
    }
}
