package oop3;

import java.util.List;
import java.util.Map;

public class Catalog {
    private List<Student> students;

    public void puneNotaInCatalog(Profesor profesor, Student student, int nota) {
        Materie materiePredata = profesor.getMaterie();
        Student studentCautat = null;

        for (Student studentCrt : students) {
            if (studentCrt.equals(student)) {
                studentCautat = studentCrt;
            }
        }

        List<Integer> notePrimite = studentCautat.getMaterieNotaMap().get(materiePredata);
        notePrimite.add(nota);
    }


    public Catalog(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}

 /*public int getAnulFabricatiei(){return anulFabricatiei;}
    public void setNrUsi(int nrUsi){this.nrUsi = nrUsi;}*/
