package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {
        Integer[] array = {4, 2, 3, 1};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, new AscComparator());
        System.out.println("Asc: " + Arrays.toString(array));
        Arrays.sort(array, new DescComparator());
        System.out.println("Desc: " + Arrays.toString(array));
        Arrays.sort(array, new DescComparator().reversed());
        System.out.println("Asc: " + Arrays.toString(array));
        Arrays.sort(array, new AscComparator().reversed());
        System.out.println("Desc: " + Arrays.toString(array));
    }

    private static class AscComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1: " + o1 + ", o2: " + o2);
            return (o1 < o2) ? -1 : (o1 > o2) ? 1 : 0;
        }
    }
    private static class DescComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1: " + o1 + ", o2: " + o2);
            return (o1 < o2) ? 1 : (o1 > o2) ? -1 : 0;
        }
    }
}
