package obiectual.sololearn.encapsulation;

import obiectual.sololearn.abstractization.InterfaceAnimal;

class Animal implements InterfaceAnimal {
    protected int legs;
    public void eat() {
        System.out.println(Animal.class.getSimpleName() + " eats and it has " + legs + " legs");
    }

    @Override
    public void doSomething() {
        System.out.println("I have implemented all the methods in the interface");
    }
}

class Dog extends Animal {
    Dog() {
        legs = 4;
    }

}

class Kangoroo extends Animal {
    Kangoroo() {
        legs = 2;
    }

}


class MyClass {
    public static void main(String[ ] args) {
        Dog d = new Dog();
        d.eat();

        Kangoroo k = new Kangoroo();
        k.eat();
    }
}