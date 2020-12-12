package obiectual.sololearn.polymorphism;

import obiectual.sololearn.abstractization.AbstractVehicle;

class Animal {

    public Animal(){

    }

    public Animal(int a){

    }

    public Animal(int a, int b){

    }

    public void makeSound() {
        System.out.println("Grr...");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    // Overloading
    public void makeSound(int a){

    }
    // Overloading
    public int makeSound(int a, int b){
        return 0;
    }

    // Overloading
    public void makeSound(double a){

    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Vehicle extends AbstractVehicle {

    @Override
    public void doSomething() {

    }
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
