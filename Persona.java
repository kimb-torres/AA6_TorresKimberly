

public class Persona{
   
    private String nombrePersona;
    private String condicion;
    private static final String CONDICION_REGULAR ="regular";
    

   
    public Persona(String nombre){
        this(nombre,CONDICION_REGULAR);  
    }
    public Persona(String pNombreP, String pCondicion){
        
        this.nombrePersona = pNombreP;
        this.condicion = pCondicion;
        
    }
    public String getNombre(){
        return nombrePersona;
    }
    
    public String getCondicion(){
        return condicion;
    }
    
    
    @Override
    public String toString(){
        return "Nombre: " + nombrePersona + ", Condición: " + condicion;
    }


    
}