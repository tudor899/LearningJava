package obiectual.sololearn.polymorphism;

class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Vehicle {

}

class Program {
    public static void main(String args[]) {
        Vehicle vehicle = new Vehicle();
        Dog a = new Dog();
        Animal b = new Cat();
        Animal c = new Animal();

        Animal[] animals = new Animal[4];

        animals[0] = a;
        animals[1] = b;
        animals[2] = c;
        //animals[3] = vehicle;

        /*for(Animal animal : animals){
            animal.makeSound();
        }*/

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }
    }
}
