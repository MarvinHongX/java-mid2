package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String s = stringList.get(0);
        System.out.println("s = " + s);
        System.out.println(stringList);

        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(300);
        System.out.println(integerList);
        Integer remove = integerList.remove(0);
        System.out.println("remove = " + remove);
        System.out.println(integerList);
    }
}