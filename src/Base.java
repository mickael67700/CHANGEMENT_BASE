import java.util.Scanner;

public class Base {
    public static void main(String[]args){
        Scanner Entree = new Scanner(System.in);
        System.out.println("Nombre à convertir : ");
        int nb = Entree.nextInt();
        System.out.println("Base de conversion : ");
        int base = Entree.nextInt();
        Entree.close();
        int quotient = 1;
        while (quotient != 0){
            quotient = nb / base;
            int reste = nb % base;
            nb = quotient;
            System.out.printf("%d\n", reste);
        }
    }
}
