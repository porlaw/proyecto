package figures;

import java.awt.Color;

/**
 * Classe per crear Figures Geomètriques.
 * @author Albert Cadena Rubio
 * @version 17/10/2016
 */
public class FiguraGeometrica {
    protected int codi;
    protected String nom;
    protected Color color;
    
    /**
     * Constructor sense paràmetres, per defecta el color de la figura serà negre.
     */
    public FiguraGeometrica(){
        color = Color.BLACK;
    }
    
    /**
     * Mètode amb paràmetres, amb codi, nom i color.
     * @param codi
     * @param nom
     * @param color 
     */
    public FiguraGeometrica(int codi, String nom, Color color){
        this.codi = codi;
        this.nom = nom;
        this.color = color;
    }
    
    /**
     * Mètode que per paràmetre rep un altre objecte FiguraGeometrica.
     * @param figura 
     */
    public FiguraGeometrica(FiguraGeometrica figura){
        this.codi = figura.getCodi();
        this.nom = figura.getNom();
        this.color = figura.getColor();
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
     * Mètode per visualitzar les dades de l'objecte.
     */
    public void visualitzar(){
        System.out.println("Codi: "+codi+", nom: "+nom+", color: "+color);
    }
    
}
