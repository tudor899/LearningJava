package obiectual.sololearn.polymorphism;

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    // Overloading
    public void makeSound(int a) {

    }

    // Overloading
    public int makeSound(int a, int b) {
        return 0;
    }

    // Overloading
    public void makeSound(double a) {

    }
}
