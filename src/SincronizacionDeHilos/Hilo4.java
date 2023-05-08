package SincronizacionDeHilos;

public class Hilo4 extends Thread{
    
     @Override
    public void run(){
        for (int i=0; i<=5; i++){
            System.err.println("S");
            
             try {
               Hilo4.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Error en la clase hilo 4 " + e);
            }
            
        }
    }
    
}
