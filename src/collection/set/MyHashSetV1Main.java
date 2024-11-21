package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println(set);

        boolean result = set.add(4);
        System.out.println("result = " + result);

        System.out.println("set.contains(3) = " + set.contains(3));
        System.out.println("set.contains(2) = " + set.contains(2));

        boolean removedValue = set.remove(2);
        System.out.println("removedValue = " + removedValue);
        System.out.println(set);

    }
}
