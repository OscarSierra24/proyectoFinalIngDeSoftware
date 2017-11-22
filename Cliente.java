
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
    public Cliente(){
    }
	public double getValorVivienda() {
		return valorVivienda;
	}
	public void setValorVivienda(double valorVivienda) {
		this.valorVivienda = valorVivienda;
	}
	public double getValorDestructible() {
		return valorDestructible;
	}
	public void setValorDestructible(double valorDestructible) {
		this.valorDestructible = valorDestructible;
	}
	public double getGastosNotariales() {
		return gastosNotariales;
	}
	public void setGastosNotariales(double gastosNotariales) {
		this.gastosNotariales = gastosNotariales;
	}
	public double getComisionApertura() {
		return comisionApertura;
	}
	public void setComisionApertura(double comisionApertura) {
		this.comisionApertura = comisionApertura;
	}
	public double getPlazo() {
		return plazo;
	}
	public void setPlazo(double plazo) {
		this.plazo = plazo;
	}
	public double getMontoPrestamo() {
		return montoPrestamo;
	}
	public void setMontoPrestamo(double montoPrestamo) {
		this.montoPrestamo = montoPrestamo;
	}
	public double getPorcentajeDeseado() {
		return porcentajeDeseado;
	}
	public void setPorcentajeDeseado(double porcentajeDeseado) {
		this.porcentajeDeseado = porcentajeDeseado;
	}
	public String getActEconomica() {
		return actEconomica;
	}
	public void setActEconomica(String actEconomica) {
		this.actEconomica = actEconomica;
	}
	public String getAtendidoPor() {
		return atendidoPor;
	}
	public void setAtendidoPor(String atendidoPor) {
		this.atendidoPor = atendidoPor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
