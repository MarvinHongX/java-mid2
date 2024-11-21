package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalGenericMain {
    public static void main(String[] args) {
        AnimalHospitalGeneric<Dog> dogHospital = new AnimalHospitalGeneric<>();
        AnimalHospitalGeneric<Cat> catHospital = new AnimalHospitalGeneric<>();

        Dog dog = new Dog("멍멍이1", 100);
        Dog biggerDog = new Dog("멍멍이2", 500);
        Cat cat = new Cat("야옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();
        catHospital.set(cat);
        catHospital.checkup();

        Dog bigger = dogHospital.bigger(biggerDog);
        System.out.println(bigger);
    }
}
