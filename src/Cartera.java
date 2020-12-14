
public class Cartera {
	
	private double dineroActual;
	
	public Cartera(double dineroActual) {
		this.dineroActual = dineroActual;
	}
	
	
	public synchronized void sumarDinero(double dinero) {
	
		dineroActual = dineroActual + dinero;
	}
	
	
	public synchronized void restarDinero(double dinero) {
		
		dineroActual = dineroActual - dinero;	
	}
	
	
	public synchronized double dineroRestante() {
		return dineroActual;
	}

}
