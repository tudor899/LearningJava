package obiectual;

public class Animal {

    private String nume;
    private int age;

    public Animal(String numeAnimal, int ageAnimal) {
        nume = numeAnimal;
        age = ageAnimal;
    }

    public void doSound() {
        System.out.println("Abstract animal sound");
    }

    public String getNume() {
        return nume;
    }

    public int getAge() {
        return age;
    }

    // Definita, titlul metodei
    // 1. Specificator de access (public, private, protected sau numic (default)
    // 1.5 Daca vrem ca metoda sa fie statica sau nu (punem static daca vrem sa fie statica)
    // 2. Tip de date returnat (return type)
    // 3. nume methoda
    // 4. Parametrii
    public void setNume(String nume) {
        // nu este return pentru ca este void
        this.nume = nume;
    }
}
