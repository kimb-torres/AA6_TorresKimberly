public class PrincipalCasetaPeaje {
  public static void main(String[] args) {
    Vehiculo a, b, c, d, e, f, g;
    a = new Vehiculo("ABC123", "particular", "Toyota", "Corolla", 2018);
    b = new Vehiculo("DEF456", "carga liviana", "Isuzu", "NPR", 2020);
    c = new Vehiculo("GHI789", "moto", "Honda", "CBR", 2022);
    d = new Vehiculo("TRK789", "carga", "Freightliner", "M2", 2021);
    e = new Vehiculo("MOT321", "moto", "Yamaha", "FZ", 2022);
    f = new Vehiculo("ZZZ111", "particular", "Honda", "Civic", 2018);
    g = new Vehiculo("EVC999", "particular", "Tesla", "Model 3", 2025);

    CasetaPeaje unaCaseta, otraCaseta;
    unaCaseta = new CasetaPeaje("Ruta 32 al Caribe de Costa Rica");
    otraCaseta = new CasetaPeaje("Ruta 32 al Caribe de Costa Rica");

    unaCaseta.cobrarPeaje(a);
    unaCaseta.cobrarPeaje(b);
    unaCaseta.cobrarPeaje(c);

    otraCaseta.cobrarPeaje(d);
    otraCaseta.cobrarPeaje(e);
    otraCaseta.cobrarPeaje(f);
    otraCaseta.cobrarPeaje(g);
    System.out.println("Ejecución por parte de: Kimberly Torres Gonzalez");
    System.out.println("La primera caseta: ");
    System.out.println(unaCaseta);
    //La línea de código anterior fuerza al objeto unaCaseta a ejecutar
    //su método toString() y por eso lo dejé así.

    System.out.println("La segunda caseta: ");
    System.out.println(otraCaseta.toString());
    //En la línea de código anterior es innecesario llamar al método toString()

    System.out.println("Casetas creadas: "
        + CasetaPeaje.getCantidadDeCasetasPeaje());

    //El estado del primer vehículo
    System.out.println("Primer vehículo creado");
    System.out.println(a);
  }
}