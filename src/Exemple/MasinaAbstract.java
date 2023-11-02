package Exemple;

public abstract class MasinaAbstract {
    private String marca;
    private int anFabricatie;

    public MasinaAbstract(String marca, int anFabricatie){
        this.marca = marca;
        this.anFabricatie = anFabricatie;
    }

    public abstract void afiseazaInformatii();


    public int getAnFabricatie() {
        return anFabricatie;
    }

    public String getMarca() {
        return marca;
    }
}
