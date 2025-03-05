/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author RafiNaufal28
 */

class Animal {
    public void makeNoise() {
        System.out.println("talk");
    }
}

class Dog extends Animal {
    public void makeNoise() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();  // Output: walk

        Dog dog = new Dog();
        dog.makeNoise();  // Output: Bark

        Animal animadog = new Dog();
        animadog.makeNoise();  // Output: Bark (karena overriding)

        // Penggunaan instanceof
        if (animal instanceof Animal) {
            System.out.println("Animal is Animal!");
        }
        if (dog instanceof Animal) {
            System.out.println("Dog is Animal!");
        }
        if (animadog instanceof Animal) {
            System.out.println("animaldog is Animal!");
        }
        if (animadog instanceof Dog) {
            System.out.println("Animal is Dog!");
        }
    }
}
