package figures;

import java.awt.Color;

/**
 * Classe per crear Triangles.
 * @author Albert Cadena Rubio
 * @version 17/10/2016
 */
public class Triangle {
    protected int codi;
    protected String nom;
    protected Color color;
    private double base;
    private double altura;
    
    public Triangle(){
        this.color = Color.BLUE;
    }
    
    public Triangle(int codi, String nom, Color color, double base, double altura){
        this.codi = codi;
        this.nom = nom;
        this.color = color;
        this.base = base;
        this.altura = altura;
    }
    
    public Triangle(Triangle figura){
        this.codi = figura.getCodi();
        this.nom = figura.getNom();
        this.color = figura.getColor();
        this.base = figura.getBase();
        this.altura = figura.getAltura();
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
    
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
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
     * Mètode per modificar la base de l'objecte.
     * @param base double positiu amb el valor de la base.
     * @return retorna 1 si s'ha pogut executar. 0 en cas contrari.
     */
    public short setBase(double base){
        if(base > 0){
            this.base = base;
            return 1;
        }
        return 0;
    }
    
    /**
     * Mètode per modificar l'alçada de l'objecte.
     * @param altura double positiu amb el valor de l'alçada.
     * @return retorna 1 si s'ha pogut executar. 0 en cas contrari.
     */
    public short setAltura(double altura){
        if(altura > 0){
            this.altura = altura;
            return 1;
        }
        return 0;
    }
    
    /**
     * Mètode per visualitzar les dades de l'objecte.
     */
    public void visualitzar(){
        System.out.println("Codi: "+codi+", nom: "+nom+", color: "+color+
                ", base: "+base+", altura: "+altura);
    }
    
    /**
     * Mètode per calcular l'àrea d'un Objecte Triangle.
     * @return Retorna un valor real amb el càlcul de l'àrea.
     */
    public double area(){
        return (base*altura)/2;
    }
}
