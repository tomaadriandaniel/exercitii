package Exemple;

public class MasinaElectricaAbstract extends MasinaAbstract {

    private int autonomie;

    public MasinaElectricaAbstract(String marca, int anFabricatie, int autonomie) {
        super(marca, anFabricatie);
        this.autonomie = autonomie;
    }


    @Override
    public void afiseazaInformatii() {
        System.out.println("Marca este: " + getMarca());
        System.out.println("An fabricatie este: " + getAnFabricatie());
        System.out.println("Autonomia este: " + autonomie);

    }


}
