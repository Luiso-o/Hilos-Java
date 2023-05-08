package HilosConParametros;

public class Proceso extends Thread{
    
     int numInt;
     
     public Proceso(String nombre){
        super(nombre); 
     }
      
    @Override
    public void run(){
         
        for(int i=0; i<=numInt; i++){
                                    //nombre del hilo
            System.out.println(i + this.getName());
                    
        }
            
        System.out.println("");
    }
      
    public void valorDeLaCondicion(int valor){
        this.numInt = valor;
                
    }
    
}
