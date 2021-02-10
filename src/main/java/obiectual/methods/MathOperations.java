package obiectual.methods;

import obiectual.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MathOperations {
    static int number = 10;


    public int addTwoNumbers(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public static Animal getRandomAnimal() {

        List<Animal> animalList = new ArrayList<>();
        Random random = new Random();
        int nr = random.nextInt(10 - 1) + 1;
        int nr1 = random.nextInt(10 - 1) + 1;
        int nr2 = random.nextInt(10 - 1) + 1;

        Animal animal1 = new Animal("caine", nr);
        Animal animal2 = new Animal("pisica", nr1);
        Animal animal3 = new Animal("cal", nr2);

        int nrIndex = random.nextInt(3);

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);

        Animal randomAnimal = animalList.get(nrIndex);

        return randomAnimal;
    }

}
