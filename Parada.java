
public class Parada
{
    
    private String codigo;
    private String nombre;

    public Parada(String pCodigo, String pNombre){
      this.codigo = pCodigo;
      this.nombre = pNombre;
        
    }
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public String toString(){
        return "Codigo: " + codigo + ", Nombre: " + nombre;
    }
    
    
    

    
    
}