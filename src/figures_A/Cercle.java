package figures_A;

import java.awt.Color;

/**
 * Classe per crear Cercles.
 * @author Albert Cadena Rubio
 * @version 17/10/2016
 */
public class Cercle extends FiguraGeometrica{
    
    public static final double PI = 3.14;
    
    private double radi;
    
    public Cercle(){
        color = Color.BLACK;
    }
    
    public Cercle(int codi, String nom, Color color, double radi){
        super(codi, nom, color);
        /*
        this.codi = codi;
        this.nom = nom;
        this.color = color;
        */
        this.radi = radi;
    }
    
    public Cercle(Cercle figura){
        super((FiguraGeometrica)figura);
        /*
        this.codi = figura.getCodi();
        this.nom = figura.getNom();
        this.color = figura.getColor();
        */
        this.radi = figura.getRadi();
    }
    
    public double getRadi(){
        return this.radi;
    }
    
    
    /**
     * Mètode per modificar el radi de l'objecte.
     * @param radi Double positiu amb el valor del radi.
     * @return retorna 1 si s'ha pogut efectuar, 0 en cas contrari.
     */
    public short setRadi(double radi){
        if(radi > 0){
            this.radi = radi;
            return 1;
        }
        return 0;
    }
    
    /**
     * Mètode per visualitzar les dades de l'objecte.
     */
    @Override
    public void visualitzar(){
        super.visualitzar();
        System.out.println("radi: "+radi);
    }
    
    /**
     * Mètode per calcular el perímetre d'un Objecte Cercle.
     * @return Retorna un valor real amb el càlcul del perímetre.
     */
    public double perimetre(){
        return 2*PI*radi;
    }
    
    /**
     * Mètode per calcular l'àrea d'un Objecte Cercle.
     * @return Retorna un valor real amb el càlcul de l'àrea.
     */
    public double area(){
        return PI*Math.pow(radi, 2);
    }
    
}
