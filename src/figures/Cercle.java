package figures;

import java.awt.Color;

/**
 * Classe per crear Cercles.
 * @author Albert Cadena Rubio
 * @version 17/10/2016
 */
public class Cercle {
    
    public static final double PI = 3.14;
    
    protected int codi;
    protected String nom;
    protected Color color;
    private double radi;
    
    public Cercle(){
        color = Color.BLACK;
    }
    
    public Cercle(int codi, String nom, Color color, double radi){
        this.codi = codi;
        this.nom = nom;
        this.color = color;
        this.radi = radi;
    }
    
    public Cercle(Cercle figura){
        this.codi = figura.getCodi();
        this.nom = figura.getNom();
        this.color = figura.getColor();
        this.radi = figura.getRadi();
    }
    
    public int getCodi(){
        return this.codi;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public Color getColor(){
        return this.color;
    }
    
    public double getRadi(){
        return this.radi;
    }
    
    /**
     * Mètode per modificar el codi de l'objecte. Només accepta codis positius.
     * @param codi
     * @return retorna 1 si s'ha pogut efectuar, 0 en cas contrari.
     */
    public short setCodi(int codi){
        if(codi >= 0){
            this.codi = codi;
            return 1;
        }else
            return 0;
    }
    
    public short setNom(String nom){
        this.nom = nom;
        return 1;
    }
    
    public short setColor(Color c){
        this.color = c;
        return 1;
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
    public void visualitzar(){
        System.out.println("Codi: "+codi+", nom: "+nom+", color: "+color+""
                + ", radi: "+radi);
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
