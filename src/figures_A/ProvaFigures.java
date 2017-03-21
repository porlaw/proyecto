package figures_A;

import java.awt.Color;

/**
 * Classe amb main per provar les diferents classes de Figures Geomètriques.
 * @author Albert Cadena Rubio
 * @version 17/10/2016
 */
public class ProvaFigures {
    public static void main(String[] args){
        System.out.println("Exercici de les Figures Geomètriques:");
        
        System.out.println("--Prova per la classe FiguraGeometrica:");
        FiguraGeometrica figura = new FiguraGeometrica(1,"figura",Color.GREEN);
        System.out.println("Informació Figura1:");
        figura.visualitzar();
        FiguraGeometrica figura2 = new FiguraGeometrica(figura);
        System.out.println("Informació Figura 2, és una copia de la 1.");
        figura2.visualitzar();
        System.out.println("Introduïm un codi negatiu: -20");
        if(figura2.setCodi(-20) == 0){
            System.out.println("No es poden introduïr codis negatius.");
        }
        System.out.println("Visualitzem si s'ha modificat el codi: "+figura2.getCodi());
        
        System.out.println("-------------------------------------");
        
        System.out.println("--Prova per la classe Rectangle:");
        Rectangle rect = new Rectangle();
        System.out.println("Color rectangle 1: "+rect.getColor());
        System.out.println("Modifiquem el color del rectangle 1, a color Vermell.");
        rect.setColor(Color.red);
        System.out.println("Nou color rectangle 1: "+rect.getColor());
        System.out.println("Afegim base = 10, altura = 20");
        rect.setAltura(20);
        rect.setBase(10);
        System.out.println("Area = "+rect.area());
        System.out.println("Perímetre = "+rect.perimetre());
        
        System.out.println("-------------------------------------");
        
        System.out.println("--Prova per a la classe Triangle:");
        Triangle tri = new Triangle(2, "Triangle 1", Color.yellow, 5, 12);
        System.out.println("Dades triangle: ");
        tri.visualitzar();
        System.out.println("Càlcul Area = "+tri.area());
        
        System.out.println("-------------------------------------");
        
        System.out.println("--Prova per a la classe Cercle:");
        Cercle c = new Cercle(3, "cercle 1", Color.yellow, 6);
        System.out.println("Dades cercle:");
        c.visualitzar();
        System.out.println("Area = "+c.area());
        System.out.println("Càlcul Perímetre = "+c.perimetre());
        
    }
}
