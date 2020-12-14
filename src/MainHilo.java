import java.util.ArrayList;


public class MainHilo {

	public static void main(String[] args) {	
		
		ArrayList<Thread> arrayHilos = new ArrayList<Thread>();
				
		for (int cont = 0; cont < 100; cont++) {
			
			int numero = (int) ((Math.random() * 5) + 1)*1000;
			Hilos hiloPrincipal = new Hilos(cont, numero);
			Thread threadPrincipal = new Thread(hiloPrincipal);
			arrayHilos.add(threadPrincipal);
		}
		
		
		for(int cont2 = 0; cont2<100; cont2++) {
			arrayHilos.get(cont2).start(); 
		}
	}
}
