package collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
        System.out.println("list.set(2, \"z\") = " + list.set(2, "z"));
        System.out.println(list);
        System.out.println("==원하는 위치에 추가==");
        list.add(2, "addList");
        System.out.println(list);
        list.add(0, "addFirst");
        System.out.println(list);

        System.out.println("==범위 초과==");
        list.add("e");
        System.out.println(list);

        Object removed1 = list.remove(0);
        System.out.println(removed1);
        System.out.println(list);

        Object removed2 = list.remove(2);
        System.out.println(removed2);
        System.out.println(list);


    }
}