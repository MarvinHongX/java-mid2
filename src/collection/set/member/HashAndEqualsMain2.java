package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberHashNoEq m1 = new MemberHashNoEq("A");
        MemberHashNoEq m2 = new MemberHashNoEq("A");
        MemberHashNoEq m3 = new MemberHashNoEq("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m3.hashCode() = " + m3.hashCode());
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));
        System.out.println("System.identityHashCode(m3) = " + System.identityHashCode(m3));
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);
        System.out.println(set.contains(m3));

    }
}
