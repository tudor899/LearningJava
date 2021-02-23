package oop3;

import java.util.*;

public class Student extends Persoana {
    private int an;
    private Map<Materie, List<Integer>> materieNotaMap = new HashMap<>();

    public double getMedie(Materie materie) {

        List<Integer> note = materieNotaMap.get(materie);
        if (note.size() == 0) {
            return 0;
        }
        int sum = 0;

        for (int i = 0; i < note.size(); i++) {
            sum += note.get(i);
        }

        double medie = (double) sum / note.size();
        return medie;
    }

    public Student() {

    }

    public int getAn() {
        return an;
    }

    public Map<Materie, List<Integer>> getMaterieNotaMap() {
        return materieNotaMap;
    }

    public void notaPrimita(Materie materie, int nota) {
        List<Integer> listaNote = materieNotaMap.get(materie);
        listaNote.add(nota);
    }

    public Student(String nume, String prenume, int varsta, Materie materie, int an) {
        super(nume, prenume, varsta);
        this.an = an;
        materieNotaMap.put(materie, new ArrayList<>());
    }

    public Student(String nume, String prenume, int varsta, Set<Materie> materii, int an) {
        super(nume, prenume, varsta);
        this.an = an;

        for (Materie materieCrt : materii) {
            materieNotaMap.put(materieCrt, new ArrayList<>());
        }

    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        if (this.getNume().equals(student.getNume()) &&
                this.getPrenume().equals(student.getPrenume())
                && this.getVarsta() == student.getVarsta()) {
            return true;
        } else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(an, materieNotaMap);
    }
}
 /*public int getAnulFabricatiei(){return anulFabricatiei;}
    public void setNrUsi(int nrUsi){this.nrUsi = nrUsi;}*/

/*  public Caroserie(String caroserie, int nrUsi, boolean isNew){
        this.caroserie = caroserie;
        setNrUsi(nrUsi);
        setIsNew(isNew);*/