package SincronizacionDeHilos;

public class Hilo1 extends Thread {
    
    @Override
    public void run(){
        for (int i=0; i<=5; i++){
            System.err.print(i+ ": L");
             
            try {
               Hilo1.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Error en la clase hilo 1 " + e);
            }
            
            
        }
    }
    
}
