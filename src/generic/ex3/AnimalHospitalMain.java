package generic.ex3;

import generic.animal.*;

public class AnimalHospitalMain {
    public static void main(String[] args) {
        AnimalHospital dogHospital = new AnimalHospital();
        AnimalHospital catHospital = new AnimalHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Dog biggerDog = new Dog("멍멍이2", 500);
        Cat cat = new Cat("야옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();
        catHospital.set(cat);
        catHospital.checkup();

        Dog bigger = (Dog) dogHospital.bigger(biggerDog);
        System.out.println(bigger);
    }

}
