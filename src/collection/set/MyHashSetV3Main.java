package collection.set;

import collection.set.member.Member;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MyHashSetV3<String> stringSet = new MyHashSetV3<>(10);
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("D");
        stringSet.add("AB");
        stringSet.add("SET");

        System.out.println(stringSet);
        System.out.println(stringSet.contains("SET"));

        MyHashSetV3<Integer> integerSet = new MyHashSetV3<>(10);
        integerSet.add(1);
        System.out.println(integerSet);

        MyHashSetV3<Member> memberSet = new MyHashSetV3<>(10);

        Member hello = new Member("Hello");
        Member java = new Member("Java");
        Member spring = new Member("Spring");
        memberSet.add(hello);
        memberSet.add(spring);
        System.out.println(memberSet);

        System.out.println("set.contains(spring) = " + memberSet.contains(spring));
        System.out.println("set.contains(java) = " + memberSet.contains(java));
    }
}