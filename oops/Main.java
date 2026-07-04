class Animal {

    void sound() {
        System.out.println("Animal is shouting");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();   // Inherited method
        d.bark();    // Dog's own method
    }
}