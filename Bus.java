
public class Bus {
  private static final String PREFIJO_CODIGO = "BUS-";
  private static final String SIN_RUTA = "(sin ruta asignada)";
  private static final String CONDICION_ESTUDIANTE = "estudiante";
  private static final String CONDICION_CIUDADANO_ORO = "ciudadano de oro";
  private static final double DESCUENTO_ESTUDIANTE = 0.50;
  private static final double DESCUENTO_CIUDADANO_ORO = 1.00;
  private static final String FORMATO_MONTO = "₡%.0f";

  private static int cantidadBuses = 0;

  private final String codigo;
  private String placa;
  private int capacidad;
  private Ruta ruta;
  private double totalRecaudado;
  private int personasAtendidas;

  
  public Bus(String pPlaca, int pCapacidad) {
    cantidadBuses++;
    this.codigo = PREFIJO_CODIGO + cantidadBuses;
    this.placa = pPlaca;
    this.capacidad = pCapacidad;
    this.ruta = null;
    this.totalRecaudado = 0;
    this.personasAtendidas = 0;
  }

  
  public static int getCantidadBuses() {
    return cantidadBuses;
  }

 
  public String getCodigo() {
    return codigo;
  }

  
  public void asignarRuta(Ruta pRuta) {
    this.ruta = pRuta;
  }

  
  public String consultarNombreRuta() {
    if (ruta == null) {
      return SIN_RUTA;
    }
    return ruta.getNombre();
  }

  
  public void cobrarPasaje(Persona pPersona) {
    if (ruta == null) {
      return;
    }
    totalRecaudado += calcularMonto(ruta.getTarifa(), pPersona.getCondicion());
    personasAtendidas++;
  }

  
  @Override
  public String toString() {
    return "Código: " + codigo
        + "\nPlaca: " + placa
        + "\nCapacidad: " + capacidad
        + "\nRuta: " + consultarNombreRuta()
        + "\nPersonas atendidas: " + personasAtendidas
        + "\nTotal recaudado: " + String.format(FORMATO_MONTO, totalRecaudado);
  }

  
  private double calcularMonto(double pTarifa, String pCondicion) {
    if (pCondicion.equals(CONDICION_ESTUDIANTE)) {
      return pTarifa * (1 - DESCUENTO_ESTUDIANTE);
    }
    if (pCondicion.equals(CONDICION_CIUDADANO_ORO)) {
      return pTarifa * (1 - DESCUENTO_CIUDADANO_ORO);
    }
    return pTarifa;
  }
}