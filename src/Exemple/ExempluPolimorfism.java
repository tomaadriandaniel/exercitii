package Exemple;

public class ExempluPolimorfism {
    public static void main(String[] args){

        Masina masina1 = new Masina("Ford","Focus",2022,15000);
        Masina masina2 = new MasinaElectrica("Tesla","Model 3", 2022, 50000, 400);
        MasinaElectrica masina3 = new MasinaElectrica("Tesla","Model X", 2022, 80000, 500);

        afiseazaInformatiiMasina(masina1);
        afiseazaInformatiiMasina(masina2);
        afiseazaInformatiiMasina(masina3);

    }

    private static void afiseazaInformatiiMasina(Masina masina) {
        masina.afiseazaInformatii();
    }
}
