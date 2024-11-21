package generic.ex2;

import generic.animal.*;

public class AnimalMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        System.out.println(dogBox.get());
        System.out.println(catBox.get());
    }
}
