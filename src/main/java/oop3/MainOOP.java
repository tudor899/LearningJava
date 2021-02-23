package oop3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainOOP {
    public static void main(String[] args) {
        Persoana tudor = new Persoana("Tudor", "Marcus", 31);
        Profesor ionescu = new Profesor("Ionescu", "Dan", 17, Materie.MEDICINA);
        Profesor prof2 = new Profesor("Popescu", "Dan", 17, Materie.INFORMATICA);

        Student marius = new Student("Moldovan", "Marius", 16, Materie.MEDICINA, 2);

        List<Student> students = new ArrayList<>();
        students.add(marius);

        Catalog catalog = new Catalog(students);

        catalog.puneNotaInCatalog(ionescu, marius, 8);
        catalog.puneNotaInCatalog(ionescu, marius, 9);
        catalog.puneNotaInCatalog(ionescu, marius, 10);

        catalog.puneNotaInCatalog(prof2, marius, 10);

        students = catalog.getStudents();

        // Enhanced for (Student student : students) { }
        // normal for for (int i = 0; i < size; i++) { }

        for (Student student : students) {

            double medie = student.getMedie(Materie.MEDICINA);
            System.out.println(medie);
        }

    }
}
