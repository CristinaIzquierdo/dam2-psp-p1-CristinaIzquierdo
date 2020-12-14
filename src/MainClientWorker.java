import java.util.ArrayList;

public class MainClientWorker {
	
	public static void main(String[] args) {
		
		ArrayList<Thread> listThreads= new ArrayList<Thread>();
				
		for(int cont = 0; cont < 10; cont++) {
			
			Cartera carteraVacia = new Cartera(0);
			Cartera carteraLlena = new Cartera(100000000);
			
			Client clienteNuevo = new Client(cont, carteraVacia);
			Thread threadClienteNuevo = new Thread(clienteNuevo);
			
			listThreads.add(threadClienteNuevo);
			
			Worker workerNuevo = new Worker(cont, carteraLlena);
			Thread threadWorkerNuevo = new Thread(workerNuevo);
			
			listThreads.add(threadWorkerNuevo);
		}
		
		for(Thread hilos : listThreads) {
			hilos.start();		
		}		
		
	}

}
