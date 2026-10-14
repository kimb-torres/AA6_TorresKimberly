import java.util.ArrayList;


public class Ruta {
  private static final int VALOR_MINIMO = 0;
  private static final int HORA_MAXIMA = 23;
  private static final int MINUTO_MAXIMO = 59;
  private static final int MINUTO_POR_OMISION = 0;
  private static final String SEPARADOR = ", ";
  private static final String FORMATO_TARIFA = "₡%.0f";

  private String codigoRuta;
  private String nombreRuta;
  private double tarifa;
  private ArrayList<Parada> paradas;
  private ArrayList<HorarioSalida> horarios;

  
  public Ruta(String pCodigo, String pNombre, double pTarifa) {
    this.codigoRuta = pCodigo;
    this.nombreRuta = pNombre;
    this.tarifa = pTarifa;
    this.paradas = new ArrayList<>();
    this.horarios = new ArrayList<>();
  }

  public String getCodigo() {
    return codigoRuta;
  }

  
  public String getNombre() {
    return nombreRuta;
  }

  
  public double getTarifa() {
    return tarifa;
  }

  
  public void agregarParada(Parada pParada) {
    for (Parada parada : paradas) {
      if (parada.getCodigo().equals(pParada.getCodigo())) {
        return;
      }
    }
    paradas.add(pParada);
  }

  
  public void registrarSalida(int pHora, int pMinuto) {
    if (esHorarioValido(pHora, pMinuto)) {
      HorarioSalida nuevo = new HorarioSalida(pHora, pMinuto);
      horarios.add(nuevo);
    }
  }
  
  public void registrarSalida(int pHora) {
    registrarSalida(pHora, MINUTO_POR_OMISION);
  }

  
  public String consultarNombresParadas() {
    String resultado = "";
    for (int i = 0; i < paradas.size(); i++) {
      resultado += paradas.get(i).getNombre();
      if (i < paradas.size() - 1) {
        resultado += SEPARADOR;//Separador ,
      }
    }
    return resultado;
  }

  
  public String consultarHorariosSalida() {
    String resultado = "";
    for (int i = 0; i < horarios.size(); i++) {
      resultado += horarios.get(i).toString();
      if (i < horarios.size() - 1) {
        resultado += SEPARADOR;
      }
    }
    return resultado;
  }

 
  @Override
  public String toString() {
    return "Código: " + codigoRuta
        + "\nNombre: " + nombreRuta
        + "\nTarifa: " + String.format(FORMATO_TARIFA, tarifa)
        + "\nParadas: " + consultarNombresParadas()
        + "\nCantidad de horarios: " + horarios.size()
        + "\nHorarios: " + consultarHorariosSalida();
  }

  
  private boolean esHorarioValido(int pHora, int pMinuto) {
    return pHora >= VALOR_MINIMO && pHora <= HORA_MAXIMA
        && pMinuto >= VALOR_MINIMO && pMinuto <= MINUTO_MAXIMO;
  }
}