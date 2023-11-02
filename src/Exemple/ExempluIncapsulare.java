package Exemple;

public class ExempluIncapsulare {
    public static void main(String[] args) {
        Masina masina1 = new Masina();
        masina1.setMarca("Ford");
        masina1.setModel("Focus");
        masina1.setAnFabricatie(2020);
        masina1.setPret(-200);

        masina1.afiseazaInformatii();
    }
}
