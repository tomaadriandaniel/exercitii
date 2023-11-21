package Exemple;

import java.util.*;

public class ExempluColectii {

    public static void main(String[] args){

        // I. Definire lista
        ArrayList<String> lista = new ArrayList<>();

        // Adaugare elemente
        lista.add("JAVA");
        lista.add("este");
        lista.add("un");
        lista.add("limbaj");
        lista.add("de");
        lista.add("programare");


        // II. Pargurgere colectii

        // 1. For each
        for(String cuvant : lista){
            System.out.println(cuvant);
        }

        // 2. Iterator
        Iterator<String> iterator = lista.iterator();
        while(iterator.hasNext()){
            String cuvant = iterator.next();
            System.out.println(cuvant);
        }

        // 3. For loop
        for(int i=0; i<lista.size(); i++){
            String cuvant = lista.get(i);
            System.out.println(cuvant);
        }

        // 4. Stream
        lista.stream()
                .forEach(cuvant -> System.out.println(cuvant));



        // III. Accesare elemente
        String cuvant = lista.get(1);


        // IV. Stergere elemente
        lista.remove("limbaj");
        lista.remove(0);
        lista.removeIf(cuv -> cuv.length()<3);

        Iterator<String> it = lista.iterator();
        while(it.hasNext()){
            String cuv = it.next();
            if(cuv.length()<5){
                it.remove();
            }
        }


        System.out.println(lista);


        // V. Sortare elemente - folosind metode din collections sau arrays

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("JAVA");
        lista2.add("este");
        lista2.add("un");
        lista2.add("limbaj");
        lista2.add("de");
        lista2.add("programare");



        // V.1 Pentru date simple (Integer, String)
        Collections.sort(lista2); //Metoda din list: lista2.sort(Comparator.naturalOrder());
        System.out.println("Lista ordonata alfabetic este: " + lista2);

        Collections.sort(lista2, Collections.reverseOrder()); //Metoda din list: lista2.sort(Comparator.reverseOrder());
        System.out.println("Lista ordonata alfabetic invers este: " + lista2);

        // V.2 Prin implementare interafata comparable si suprascriere compareTo
        List<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(new Student("Ana", 9, 22));
        listaStudenti.add(new Student("Cristi", 8, 20));
        listaStudenti.add(new Student("Bogdan", 10, 23));

        lista2.sort(null);
        Collections.sort(listaStudenti);

        for(Student student : listaStudenti){
            System.out.println(student);
        }

        // V.3 Folosind un comparator extern (clasa student implementeaza comparable)
        List<Student> listaStudenti2 = new ArrayList<>();
        listaStudenti2.add(new Student("Ana", 9, 22));
        listaStudenti2.add(new Student("Cristi", 8, 20));
        listaStudenti2.add(new Student("Bogdan", 10, 23));

        // V.3.a Metoda suprascrisa
        Comparator<Student> comparatorNota = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getNota(),s2.getNota());
            }
        };
        Collections.sort(listaStudenti2,comparatorNota);
        for(Student student:listaStudenti2){
            System.out.println(student);
        }


        // V.3.b Expresie lambda
        Comparator<Student> comparatorNota2 = (s1, s2) -> Integer.compare(s1.getNota(),s2.getNota());

        // V.3.c Apelare metoda
        Comparator<Student> comparatorNota3 = Comparator.comparingInt(Student::getNota);

        Collections.sort(listaStudenti2,comparatorNota3);
        System.out.println(listaStudenti2);



        // Alt exemplu de comparator extern pentru nume

        Comparator<Student> comparatorNume = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getNume().compareTo(s2.getNume());
            }
        };

        Collections.sort(listaStudenti2,comparatorNume);
        System.out.println(listaStudenti2);

        // Expresie lambda comparator nume
        Comparator<Student> comparatorNume2 = (s1, s2) -> s1.getNume().compareTo(s2.getNume());

        // Apelare metoda comporator nume
        Comparator<Student> comparatorNume3 = Comparator.comparing(Student::getNume);







    }







    }

