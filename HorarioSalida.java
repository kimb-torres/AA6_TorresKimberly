

public class HorarioSalida{
    
    private int hora;
    private int minuto;
    private static final String FORMATO ="%02d:%02d";

    
    public HorarioSalida(int hora){
        this(hora,0);
    }
    public HorarioSalida(int pHora,int pMinuto){
        this.hora  = pHora;
        this.minuto = pMinuto;
    }
    @Override
    public String toString(){
        return String.format(FORMATO,hora,minuto);
    }
    

}