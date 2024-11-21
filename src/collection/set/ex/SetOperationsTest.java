package collection.set.ex;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 합집합, 교집합, 차집합
public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        HashSet<Integer> unionSet = new HashSet<Integer>();
        HashSet<Integer> intersectionSet = new HashSet<Integer>();
        HashSet<Integer> differenceOfSet = new HashSet<Integer>();

        unionSet.addAll(set1);
        unionSet.addAll(set2);
        System.out.println("unionSet = " + unionSet);

        intersectionSet.addAll(set1);
        intersectionSet.retainAll(set2);
//        for (Integer s : set1) {
//            if (set2.contains(s)) {
//                intersectionSet.add(s);
//            }
//        }
        System.out.println("intersectionSet = " + intersectionSet);

        differenceOfSet.addAll(set1);
        differenceOfSet.removeAll(set2);
//        for (Integer s : set1) {
//            if (!set2.contains(s)) {
//                differenceOfSet.add(s);
//            }
//        }
        System.out.println("differenceOfSet = " + differenceOfSet);
    }
}
