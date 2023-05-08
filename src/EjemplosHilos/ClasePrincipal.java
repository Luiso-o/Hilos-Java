package EjemplosHilos;

 public class ClasePrincipal {

    public static void main(String[] args) {

        Proceso1 hiloConHerencia = new Proceso1 ();
        
        Thread hiloConAbstraccion = new Thread (new Proceso2());
        
        //metodo para arrancas nuestros hilos
        hiloConHerencia.start();
        hiloConAbstraccion.start();
    }
    
}

    

