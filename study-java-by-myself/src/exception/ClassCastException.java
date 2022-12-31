package exception;


public class ClassCastException {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);
    }

    public static void changeDog(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        } else {
            System.out.println("Dog 객체가 아닙니다.ㅡ");
        }
    }

}


class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

