package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        System.out.println("명시적 타입 인자 전달");
        Integer intValue1 = GenericMethod.<Integer>genericMethod(i);
        Integer intValue2 = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>genericMethod(20.0);

        System.out.println("타입 추론");
        GenericMethod.genericMethod(i);
        GenericMethod.numberMethod(10);
        GenericMethod.genericMethod(20.0);
    }
}
