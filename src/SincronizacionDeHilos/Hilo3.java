package SincronizacionDeHilos;

public class Hilo3 extends Thread{
     @Override
    public void run(){
        for (int i=0; i<=5; i++){
            System.err.print("I");
            
             try {
               Hilo3.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Error en la clase hilo 3 " + e);
            }
            
        }
    }
}
