package EjemplosHilos;
//Ejemplo con abstraccion
public class Proceso2 implements Runnable{

    @Override
    public void run() {
        
      for(int i=0; i<=5; i++){
          
           System.out.println("proceso 2"); 
           
      }        
   }
}
