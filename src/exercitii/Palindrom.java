package exercitii;

public class Palindrom {
    public static void main(String[] args) {
        int init = 4224;
        int x = init;
        int palindrom=0;
        while (x != 0){
            palindrom = palindrom*10 + x%10;
            x=x/10;
        }
        if (init == palindrom)
            System.out.println("Numarul " + init + " este palindrom");
        else
            System.out.println("Numarul " + init +  " nu este palindrom");


    }
}
