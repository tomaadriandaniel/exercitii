package Exemple;

public class ExempluSupraincarcare {

    public int aduna(int a, int b){
        return a+b;
    }

    public double aduna(double a, double b){
        return a+b;
    }

    public int aduna(int a, int b, int c){
        return a+b+c;
    }

    public static void main (String[] args){
        ExempluSupraincarcare exemplu = new ExempluSupraincarcare();

        System.out.println("Rezultatul adunarii cu 2 nr intregi este: " + exemplu.aduna(10,30));
        System.out.println("Rezultatul adunarii cu 2 nr double este: " + exemplu.aduna(10,12.5));
        System.out.println("Rezultatul adunarii cu 3 nr intregi este: " + exemplu.aduna(10,30,20));

    }
}
