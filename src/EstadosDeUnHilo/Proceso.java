package EstadosDeUnHilo;

public class Proceso {
    
    public static void main(String[] args) {
        
       HiloProceso hilo1 = new HiloProceso();
       HiloProceso hilo2 = new HiloProceso();
           
       hilo1.start();
       
       try{
           
       hilo1.sleep(1000);
       
       }catch(InterruptedException e){
           
           System.out.println("Error en el hilo 1" + e);
           
       }
       
       hilo2.start();//el hilo Arranca
       hilo2.stop();//El hilo se detiene
       
       try{
           
       hilo2.sleep(1000);
       
       }catch(InterruptedException e){
           
           System.out.println("Error en el hilo 2" + e);
           
       }
               
    }
    
}
