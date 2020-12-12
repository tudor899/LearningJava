package obiectual.sololearn;

class Animal {
    protected int legs;
    public void eat() {
        System.out.println(Animal.class.getSimpleName() + " eats and it has " + legs + " legs");
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