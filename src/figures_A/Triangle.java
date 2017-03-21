package figures_A;

import java.awt.Color;

/**
 * Classe per crear Triangles.
 * @author Albert Cadena Rubio
 * @version 17/10/2016
 */
public class Triangle extends FiguraGeometrica{
    private double base;
    private double altura;
    
    public Triangle(){
        this.color = Color.BLUE;
    }
    
    public Triangle(int codi, String nom, Color color, double base, double altura){
        super(codi, nom, color);
        /*
        this.codi = codi;
        this.nom = nom;
        this.color = color;
        */
        this.base = base;
        this.altura = altura;
    }
    
    public Triangle(Triangle figura){
        super((FiguraGeometrica)figura);
        /*
        this.codi = figura.getCodi();
        this.nom = figura.getNom();
        this.color = figura.getColor();
        */
        this.base = figura.getBase();
        this.altura = figura.getAltura();
    }
    
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
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
    @Override
    public void visualitzar(){
        super.visualitzar();
        System.out.println("base: "+base+", altura: "+altura);
    }
    
    /**
     * Mètode per calcular l'àrea d'un Objecte Triangle.
     * @return Retorna un valor real amb el càlcul de l'àrea.
     */
    public double area(){
        return (base*altura)/2;
    }
}
