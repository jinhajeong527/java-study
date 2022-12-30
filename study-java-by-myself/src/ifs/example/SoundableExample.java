package ifs.example;

import ifs.example.Cat;
import ifs.example.Dog;
import ifs.example.Soundable;

public class SoundableExample {
    private static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}
