package obiectual;

public class Animal {

    String nume;
    int age;

    public Animal(String numeAnimal, int ageAnimal) {
        nume = numeAnimal;
        age = ageAnimal;
    }

    public String getNume() {
        return nume;
    }

    public int getAge(){
        return age;
    }

}
