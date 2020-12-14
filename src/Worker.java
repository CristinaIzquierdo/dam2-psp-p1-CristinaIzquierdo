

public class Worker implements Runnable{
	
	private int idClient;
	private Cartera cartera;
	private boolean infinito = true;
		
	
	public Worker(int idClient, Cartera cartera) {
		this.idClient = idClient;
		this.cartera = cartera;
	}

	public void run() {
		try {	
			while(infinito) {
				Thread.sleep(1000);
				
				int numero = (int) ((Math.random() * 100));
				cartera.restarDinero(numero);
				
				System.out.println("\"Al cliente con el id: " +idClient+" se le han restado " + numero + "€ de su cartera."
						+ "\nAhora dispone de:  " + cartera.dineroRestante() + "€ restantes. ");
			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}


}
