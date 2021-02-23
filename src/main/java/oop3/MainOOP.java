package oop3;

public class MainOOP {
    public static void main(String[] args){
        Persoana tudor = new Persoana("Tudor", "Marcus", 31);
        Profesor ionescu = new Profesor("Ionescu", "Dan", Facultati.MEDICINA);
        Student marius = new Student("Moldovan", "Marius", Facultati.INFORMATICA, 3, "matematica");
        Catalog note = new Catalog("Moldovan", "Marius", "Engleza", {9, 8, 10});

    }
}
