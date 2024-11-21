package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        System.out.println(stringList);
        stringList.add("a");
        System.out.println(stringList);
        stringList.add("b");
        System.out.println(stringList);
        stringList.add("c");
        System.out.println(stringList);

        String str = stringList.get(0);
        System.out.println("str = " + str);

        System.out.println();
        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        System.out.println(integerList);
        integerList.add(1);
        System.out.println(integerList);
        integerList.add(2);
        System.out.println(integerList);
        integerList.add(3);
        System.out.println(integerList);

        Integer integerValue = integerList.get(0);
        System.out.println("integerValue = " + integerValue);
    }
}