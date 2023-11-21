package Exemple;

import java.util.Objects;


public class Student implements Comparable<Student> {
    private String nume;
    private int nota;
    private int varsta;

    public Student(String nume, int nota, int varsta) {
        this.nume = nume;
        this.nota = nota;
        this.varsta = varsta;
    }


      @Override
    public int compareTo(Student altStudent) {
        int rezultatComparareNume = this.nume.compareTo(altStudent.nume);
        if (rezultatComparareNume != 0) {
            return rezultatComparareNume;
        }

        int rezultatComparareNota = Integer.compare(this.nota, altStudent.nota);
        if (rezultatComparareNota != 0) {
            return rezultatComparareNota;
        }

        return Integer.compare(this.varsta, altStudent.varsta);

    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return nota == student.nota &&
                varsta == student.varsta &&
                Objects.equals(nume, student.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, nota, varsta);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", nota=" + nota +
                ", varsta=" + varsta +
                '}';
    }
}
