package Exemple;

public class ExempluMostenire {
    public static void main (String[] args){

        MasinaElectrica masinaElectrica = new MasinaElectrica("Tesla","Model 3", 2022, 50000, 400);

        masinaElectrica.afiseazaInformatii();
        System.out.println("Impozitul este: " + masinaElectrica.calculareImpozit());

        Masina masina1 = new MasinaElectrica("Tesla","Model 3", 2022, 50000, 400);
        masina1.afiseazaInformatii();
    }
}
