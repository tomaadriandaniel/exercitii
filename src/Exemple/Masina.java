package Exemple;

import java.util.Objects;

public class Masina {
    String marca;
    String model;
    int anFabricatie;
    double pret;

    public Masina (){}
    public Masina(String marca, String model, int anFabricatie, double pret){
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.pret = pret;
    }

    public void afiseazaInformatii(){
        System.out.println("Marca este: " + marca);
        System.out.println("Modelul este: " + model);
        System.out.println("Anul de fabricatie este: " + anFabricatie);
        System.out.println("Pretul este: " + pret);
    }

    public double calculareImpozit(){
        double impozit = 0.2 * pret;
        return impozit;
    }



    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", pret=" + pret +
                '}';

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Masina masina = (Masina) o;
        return anFabricatie == masina.anFabricatie &&
                Double.compare(masina.pret, pret) == 0 &&
                Objects.equals(marca, masina.marca) &&
                Objects.equals(model, masina.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, model, anFabricatie, pret);
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        if(pret >= 0) {
            this.pret = pret;
        }
        else{
            System.out.println("Pretul trebuie sa fie mai mare sau egal cu zero!");
        }
    }
}
