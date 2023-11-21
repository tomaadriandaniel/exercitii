package Exemple;

public class ExempluUtilizareClasa {

    public static void main(String[] args) {

        Masina masina1 = new Masina("Ford","Focus",2022,15000);
        Masina masina2 = new Masina("Ford","Focus",2022,15000);
        Masina masina3 = masina1;

        masina1.afiseazaInformatii();
        double impozit1 = masina1.calculareImpozit();
        System.out.println("Impozitul pentru masina1 este: " + impozit1);
        System.out.println(masina1);



        if (masina1.equals(masina2)){
            System.out.println("Compare cu equals: masina1 si masina2 sunt egale!");
        } else{
            System.out.println("Compare cu equals: masina1 si masina2 NU sunt egale!");
        }



        if (masina1==masina2){
            System.out.println("Compare cu ==: masina1 si masina2 sunt egale!");
        } else{
            System.out.println("Compare cu ==: masina1 si masina2 NU sunt egale!");
        }



        System.out.println("hashcode pt masina1 este: " + masina1.hashCode());
        System.out.println("hashcode pt masina2 este: " + masina2.hashCode());
        System.out.println("hashcode pt masina3 este: " + masina3.hashCode());




    }

}
