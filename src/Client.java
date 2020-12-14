
public class Client implements Runnable{
	
	private int idClient;
	private Cartera cartera;
	private boolean infinito = true;
	

	public Client(int idClient, Cartera cartera) {
		this.idClient = idClient;
		this.cartera = cartera;
	}

	public void run() {
		try {		
			while(infinito) {
				Thread.sleep(1000); //espera 1 seg
				
				int numero = (int) ((Math.random() * 100));
				cartera.sumarDinero(numero);
				
				System.out.println("Al cliente con el id: " + idClient+ " Se le han sumado " + numero + "€ a su cartera."
									+ "\nActualmente dispone de " + cartera.dineroRestante() + "€ en su cartera");

			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}


	

}
