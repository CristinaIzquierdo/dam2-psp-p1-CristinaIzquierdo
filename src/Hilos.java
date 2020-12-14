

public class Hilos implements Runnable{
	
	private int numCont;
	private int miliSegundo;

	public Hilos(int numCont, int miliSegundo) {
		this.numCont = numCont;
		this.miliSegundo = miliSegundo;
	}

	@Override
	public void run() {
		try {			
			System.out.println("Soy el hilo " + numCont + " y me pongo a dormir " + (miliSegundo / 1000) + " segundos.");
			Thread.sleep(miliSegundo);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("Soy hilo " + numCont + " y he terminado de dormir.");
	}	
}



