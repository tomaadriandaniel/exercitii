package Exemple;

public class MasinaElectrica extends Masina {

    private int autonomie;

    public MasinaElectrica (int autonomie){
        this.autonomie = autonomie;
    }


    public MasinaElectrica(String marca, String model, int anFabricatie, double pret, int autonomie) {
        super(marca, model, anFabricatie,pret);
        this.autonomie = autonomie;
    }

    public MasinaElectrica() {

    }

    public void afiseazaInformatii(){
        super.afiseazaInformatii();
        System.out.println("Autonomia este: " + autonomie);
    }

    public int getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
    }
}
