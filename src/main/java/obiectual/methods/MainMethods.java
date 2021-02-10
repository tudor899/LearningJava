package obiectual.methods;

import obiectual.Animal;

public class MainMethods {
    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();
        System.out.println(mathOperations.addTwoNumbers(2, 3));

        Animal randomAnimal = MathOperations.getRandomAnimal();

        randomAnimal.setNume("delfin");
        System.out.println(randomAnimal.getNume());

    }
}
