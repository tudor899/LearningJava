package obiectual;// Am creat o clasa
// numele clasei corespunde cu numele fisierului (cea publica)
// Daca pui o clasa in interiorul altei clase (aceasta in cazul de fata) nu mai folosesti public

/*
    Tema: 1. Creaza-ti clasele : Caine, Pisica, Hamster
          2. Da-le 2 proprietati (argumente, field-uri) culoare, rasa, nume
          3. Creezi care verifica ca s-au setat proprietatiile in pachetul de teste (director)
          4. Optional: Printeaza proprietatiile animalelor create (instante ale claselor de mai sus: Caine, Pisica, Hamster
 */

public class PunctDeStart {
    // Clasa care contine punctul de start
    // punctul de start este main()
    public static void main(String[] args) {
        // Am creat un obiect (instanta unei clase) de tip obiectual.Animal
        Animal rex = new Animal("Leo", 2);

        // Am declarat o variabila goala de tip String
        String numeCaine = "";

        // Am asignat valoarea returnata de getName al obiectului rex in variabila numeCaine
        numeCaine = rex.getNume();

        // Am printat continutul variabile numeCaine
        System.out.println(numeCaine);

        // printam varsta animalului
        System.out.println(rex.getAge());
    }
}