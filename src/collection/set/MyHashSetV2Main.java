package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        set.add(9);
        System.out.println(set);
        System.out.println(set.contains("SET"));

        Member hello = new Member("Hello");
        Member java = new Member("Java");
        Member spring = new Member("Spring");
        set.add(hello);
        set.add(spring);
        System.out.println(set);

        System.out.println("set.contains(spring) = " + set.contains(spring));
        System.out.println("set.contains(java) = " + set.contains(java));
    }
}
