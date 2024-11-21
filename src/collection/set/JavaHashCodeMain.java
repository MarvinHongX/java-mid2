package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1 = " + obj1.hashCode());
        System.out.println("obj2 = " + obj2.hashCode());

        Integer i1 = 10;
        Integer i2 = -1;
        String strA = "A";
        String strB = "B";
        String strAB = "AB";
        System.out.println("i1.hashCode() = " + i1.hashCode());
        System.out.println("i2.hashCode() = " + i2.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strB.hashCode() = " + strB.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        // 둘은 같을까 다를까?
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");
        System.out.println("member1 == member2: " + (member1 == member2));
        System.out.println("member1 = " + member1.hashCode());
        System.out.println("member2 = " + member2.hashCode());
    }
}
