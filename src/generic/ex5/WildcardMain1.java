package generic.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        catBox.set(new Cat("야옹이", 50));
        WildcardEx.printGenericV1(objectBox);
        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printGenericV1(catBox);
        WildcardEx.printWildcardV1(objectBox);
        WildcardEx.printWildcardV1(dogBox);
        WildcardEx.printWildcardV1(catBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printGenericV2(catBox);
        WildcardEx.printWildcardV2(dogBox);
        WildcardEx.printWildcardV2(catBox);

        WildcardEx.printAndReturnGeneric(dogBox);
        WildcardEx.printAndReturnGeneric(catBox);
        WildcardEx.printAndReturnWildcard(dogBox);
        WildcardEx.printAndReturnWildcard(catBox);


    }
}
