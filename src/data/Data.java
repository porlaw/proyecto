package data;

import eines.Eines;

/**
 * Classe que simula a la classe de Java 'Date', que està deprecated.
 * @author Albert Cadena Rubio
 * @version 17/10/2016
 */
public class Data {
    private short dia;
    private short mes;
    private int any;//Max date 9999.
    
    /*Constants de la classe.*/
    private static final int LI_ANY = 0;
    private static final int LS_ANY = 9999;
    private static final int LI_MES = 1;
    private static final int LS_MES = 12;
    
    {
        dia = 1;
        mes = 1;
        any = 1980;
    }
    
    /**
     * Constructor d'una nova data, on podrem donar valor al dia, mes i any.
     * @param dia Sencer amb el dia de la data.
     * @param mes Sencer amb el mes de la data.
     * @param any Sencer amb l'any de la data.
     */
    public Data(int dia, int mes, int any){
        if(dia >= 1 && any >= LI_ANY && any <= LS_ANY && dia <= diasMes(mes, any)){
            /*Comprovem si el número de dia està dins dels marges
                de dia màxim d'un mes i any concret.*/
            this.dia = (short)dia;
            this.mes = (short)mes;
            this.any = any;
        }
    }
    
    /**
     * Constructor que fa una copia d'una Data ja existent.
     * @param d Objecte Data a copiar.
     */
    public Data(Data d){
        this.dia = d.dia;
        this.mes = d.mes;
        this.any = d.any;
    }
    
    /**
     * Constructor sense paràmetres.
     */
    public Data(){
    }
    
    public short getDia(){
        return this.dia;
    }
    
    public short getMes(){
        return this.mes;
    }
    
    public int getANY(){
        return this.any;
    }
    
    /**
     * Modifica el dia de l'objecte, mentre l'any sigui entre 0 i el 9999.
     * I que dia sigui superior a 1 fins a un dia vàlid per a la data existent.
     * @param dia valor sencer amb el dia a entrar.
     * @return si l'entrada ha estat vàlida, retorna 1. Retorna 0 en cas contrari.
     */
    public short setDia(int dia){
        if(dia >= 1 && dia <= diasMes(mes, any)){
            this.dia = (short)dia;
            return 1;
        }
        return 0;
    }
    
    /**
     * Modifica el mes de l'objecte, metre el mes estigui entre 1 i 12 tots
     * dos valor inclossos.
     * @param mes valor sencer del mes a entrar.
     * @return si l'entrada ha estat vàlida, retorna 1. Retorna 0 en cas contrari.
     */
    public short setMes(int mes){
        if(mes >= LI_MES && mes <= LS_MES){
            if(this.dia <= diasMes(mes, this.any)){
                this.mes = (short)mes;
                return 1;
            }
        }
        return 0;
    }
    
    /**
     * Modifica l'any de l'objecte, mentre el valor sigui superior a 0 i inferior
     * a 9999. I que sigui coherent amb el dia i el mes ja guardats.
     * @param any valor sencer de l'any a entrar.
     * @return si l'entrada ha estat vàlida, retorna 1. Retorna 0 en cas contrari.
     */
    public short setAny(int any){
        if(any >= LI_ANY && any <= LS_ANY && this.dia <= diasMes(this.mes, any)){
            this.any = any;
            return 1;
        }
        return 0;
    } 
    
    /**
     * Métode per sumar una quantitat sencera de dies a l'objecte data. Podrà sumar
     * i restar dies.
     * @param dies sencer positiu o negatiu per sumar als dies.
     * @return Retorna un string amb l'estructura de la nova data.
     */
    public String sumaDies(int dies){
        int aux_dia = (int)this.dia;
        int aux_mes = (int)this.mes;
        int aux_any = this.any;
        int[] data = new int[3];
        if(dies >= 0){//Suma Dies.
            for(int i = 0; i < dies; i++){
                data = diaSeguent(aux_dia, aux_mes, aux_any);
                aux_dia = data[0];
                aux_mes = data[1];
                aux_any = data[2];
            }
        }else{//Resta dies
            for(int i = 0; i > dies; i--){
                data = diaAnterior(aux_dia, aux_mes, aux_any);
                aux_dia = data[0];
                aux_mes = data[1];
                aux_any = data[2];
            }
        }
        //System.out.println("Data: "+aux_dia+"-"+aux_mes+"-"+aux_any);
        return aux_dia+"-"+aux_mes+"-"+aux_any;
    }
    
    /**
     * Métode per comparà si la data entrada com a paràmetre és igual a la data
     * implícita.
     * @param d Objecte Data a comparar.
     * @return Retorna true si són iguals, false en cas contrari.
     */
    public boolean compare(Data d){
        if(this.dia != d.getDia() || this.mes != d.getMes() || this.any != d.getANY()){
            return false;
        }
        return true;
    }
    
    /**
     * Mètode per calcuar quants dies separan dues Dates.
     * @param d Objecte data a comparar amb la Data ja implícita.
     * @return Retorna un sencer positiu amb el número de dies de diferéncia.
     */
    public int quantsDies(Data d){
        int dies = 1;
        boolean dates_iguales = false;
        
        int aux_dia = 0;
        int aux_mes = 0;
        int aux_any = 0;
        
        int[] data = new int[3];
        
        if(this.compare(d)){
            return 0;
            
        }else if(dataMesGran(d, this) ){
            aux_dia = (int)this.dia;
            aux_mes = (int)this.mes;
            aux_any = this.any;
            //System.out.println("La segona data és més gran");
            
            do{
            
                data = diaSeguent(aux_dia, aux_mes, aux_any);
                //System.out.println(data[0] +" - "+ data[1] +" - "+ data[2]);
                aux_dia = data[0];
                aux_mes = data[1];
                aux_any = data[2];
                if(new Data(aux_dia, aux_mes, aux_any).compare(d)){
                    dates_iguales = true;
                    //System.out.println(dies);
                }else
                    dies++;
            }while(dates_iguales == false);
            
        }else{/*if(dataMesGran(this, d))*/
            aux_dia = (int)d.getDia();
            aux_mes = (int)d.getMes();
            aux_any = d.getANY();
            //System.out.println("La primera data és més gran");
            
            do{
            
                data = diaSeguent(aux_dia, aux_mes, aux_any);
                //System.out.println(data[0] +" - "+ data[1] +" - "+ data[2]);
                aux_dia = data[0];
                aux_mes = data[1];
                aux_any = data[2];
                if(new Data(aux_dia, aux_mes, aux_any).compare(this)){
                    dates_iguales = true;
                    //System.out.println(dies);
                }else
                    dies++;
        }while(dates_iguales == false);
        }
        
        
        
        return dies;
    }
    
    /**
     * Mètode per visualitzar les dades de l'objecte.
     */
    public void visualitzar(){
        System.out.println("Data: "+dia+"-"+mes+"-"+any);
    }
    
    /**
     * Métode per veure quines de les dues dates és més gran.
     * @param d1 primera Data a comparar.
     * @param d2 segona Data a comparar.
     * @return retorna true si la primera data és superior a la segona, false
     * en cas contrari.
     */
    private static boolean dataMesGran(Data d1, Data d2){
        
        if(d1.getANY() > d2.getANY()){
            return true;
        }else{
            if(d1.getMes() > d2.getMes()){
                return true;
            }else{
                if(d1.getDia() > d2.getDia()){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    /**
     * Mètode que diu quin número de dia màxim accepta cada més de l'any.
     * @param mes senser representant al mes
     * @param any senser representant a l'any
     * @return número de díes màxims.
     */
    private int diasMes(int mes, int any){
        int dies=0;
        switch(mes){
            //Enero, marzo, mayo, julio, agosto, octubre y diciembre 31 dias.
            case 1://Enero
            case 3://Marzo
            case 5://Mayo
            case 7://Julio
            case 8://Agosto
            case 10://Octubre
            case 12://Diciembre.
                dies = 31;
                break;
            //Abril, junio, septiembre y noviembre 30 dias.
            case 4://Abril
            case 6://Junio
            case 9://Septiembre
            case 11://Noviembre.
                dies = 30;
                break;
            case 2://Febrero.
                if(anyDeTraspas(any)){dies=29; break;} 
                else {dies=28; break;}
            default:
                return 0;
        }
        return dies;
    }
    /**
     * Mètode per comprovar si un any és de traspàs
     * @param any senser representant a l'any
     * @return True si l'any és de traspàs.
     */
    private boolean anyDeTraspas(int any){
        return((any%4)==0 && (any%100)!= 0 || (any%400) == 0);
    }
    
    
    private int[] diaSeguent(int dia, int mes, int any){
        int[] data = new int[3];
        dia++;
        if(dia <= diasMes(mes, any)){     
        }else if(dia > diasMes(mes, any)){
            dia = 1;
            mes++;
            if(LI_MES <= mes && mes <= LS_MES){  
            }else{
                mes = 1;
                any++;
            }
        }
        data[0] = dia;
        data[1] = mes;
        data[2] = any;
        return data;
    }
    
    private int[] diaAnterior(int dia, int mes, int any){
        int[] data = new int[3];
        dia--;
        if(dia <= diasMes(mes, any) && dia >= 1){     
        }else if(dia < 1){
            dia = diasMes(mes,any);
            mes--;
            if(LI_MES <= mes && mes <= LS_MES){  
            }else{
                mes = 12;
                any--;
            }
        }
        data[0] = dia;
        data[1] = mes;
        data[2] = any;
        return data;
    }
    
    //Final Funció que ens diu la data del dia següent.
    
    public static void main(String[] args){
        
        Data programa = new Data(3,1,2016);
        programa.visualitzar();
        System.out.println("Suma 500000 dies a una data:");
        System.out.println(programa.sumaDies(500000));
        System.out.println("Suma -3 dies a una data:");
        System.out.println(programa.sumaDies(-3));
        programa.visualitzar();
        System.out.println("---------------");
        
        //Comparar 2 dates.
        System.out.println("Comparar dues dates:");
        Data d1 = new Data(1,1,1200);
        Data d2 = new Data(1,1,1200);
        System.out.println(d1.compare(d2));
        
        System.out.println("---------------");
        System.out.println("Quantes dies separa a dues dates:");
        Data d11 = new Data(10,1,2000);
        Data d22 = new Data(25,3,2001);
        System.out.println(d11.quantsDies(d22));
                
        
    }
}
