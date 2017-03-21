package eines;

import java.util.Scanner;

/**
 * Recull de funcions més utilitzades.
 *
 * @author Albert Cadena Rubio
 * @version 5/10/2016
 */
public class Eines {

    //----LECTURA DE SENCERS:
    public static int llegeixInt0oSuperior() {
        Scanner lector = new Scanner(System.in);
        boolean lectura_correcte = false;
        int num = 0;
        do {
            if (lector.hasNextInt()) {
                num = lector.nextInt();
                if (num >= 0) {
                    lectura_correcte = true;
                } else {
                    System.out.println("Ha de ser un valor 0 o superior.");
                }

            } else {
                System.out.println("Tipus de dada incorrecte!");
            }
            lector.nextLine();
        } while (lectura_correcte == false);

        return num;
    }
    
    public static int llegeixIntLimits(int li, int ls) {
        Scanner lector = new Scanner(System.in);
        boolean lectura_correcte = false;
        int num = 0;
        do {
            if (lector.hasNextInt()) {
                num = lector.nextInt();
                if (li <= num && num <= ls) {
                    lectura_correcte = true;
                } else {
                    System.out.printf("Ha de ser un valor entre %d i %d", li, ls);
                }
            } else {
                System.out.println("Tipus de dada incorrecte!");
            }
            lector.nextLine();
        } while (lectura_correcte == false);

        return num;
    }
    
    //----LECTURA DE REALS:
    
    public static double llegirDouble(){
        Scanner lector = new Scanner(System.in);
        boolean lectura_correcte = false;
        double num = 0;
        do {
            if (lector.hasNextDouble()) {
                num = lector.nextDouble();
                lectura_correcte = true;
            } else {
                System.out.println("Tipus de dada incorrecte!");
            }
            lector.nextLine();
        } while (lectura_correcte == false);

        return num;
    }
    
    public static double llegirDouble0oSuperior(){
        Scanner lector = new Scanner(System.in);
        boolean lectura_correcte = false;
        double num = 0;
        do {
            if (lector.hasNextDouble()) {
                num = lector.nextDouble();
                if (num >= 0) {
                    lectura_correcte = true;
                } else {
                    System.out.println("Ha de ser un valor 0.0 o superior.");
                }

            } else {
                System.out.println("Tipus de dada incorrecte!");
            }
            lector.nextLine();
        } while (lectura_correcte == false);

        return num;
    }
    
    
    
    //----LECTURA DE CADENES DE CARÀCTERS:
    public static String llegirParaula(){
        Scanner lector = new Scanner(System.in);
        String paraula = lector.next();
        return paraula;
    }
    
    /*
    public static char llegirUnCaracter(){
        Scanner lector = new Scanner(System.in.read());
    }
    */
}
