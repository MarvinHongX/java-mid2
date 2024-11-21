package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objectBox);
        writeBox(animalBox);
//        writeBox(dogBox);
//        writeBox(catBox);

    }
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
        System.out.println(box.get());
    }
}
