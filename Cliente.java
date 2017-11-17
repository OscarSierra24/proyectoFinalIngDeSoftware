
public class Cliente {
    double valorVivienda,valorDestructible, gastosNotariales, comisionApertura,plazo,montoPrestamo,porcentajeDeseado;
    String actEconomica, atendidoPor, nombre;
	public Cliente(double valorVivienda, double valorDestructible, double gastosNotariales, double comisionApertura,
			double plazo, double montoPrestamo, double porcentajeDeseado, String actEconomica, String atendidoPor,
			String nombre) {
		this.valorVivienda = valorVivienda;
		this.valorDestructible = valorDestructible;
		this.gastosNotariales = gastosNotariales;
		this.comisionApertura = comisionApertura;
		this.plazo = plazo;
		this.montoPrestamo = montoPrestamo;
		this.porcentajeDeseado = porcentajeDeseado;
		this.actEconomica = actEconomica;
		this.atendidoPor = atendidoPor;
		this.nombre = nombre;
	}
    
}
