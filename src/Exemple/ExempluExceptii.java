package Exemple;

public class ExempluExceptii {

    public static void main(String[] args){
        try {
            int rezultat = impartire(10, 0);
            System.out.println("Rezultatul este: " + rezultat);
        } catch (ArithmeticException e){
            System.out.println("A aparatut o eroare de tipul aritmetica!");
        }
    }

    private static int impartire(int a, int b) {
        if (b==0){
            throw new ArithmeticException("Impartirea la 0 nu are sens!");
        }
        return a/b;
    }
}
