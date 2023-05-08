/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SincronizacionDeHilos;

public class Hilo2 extends Thread{
    
    @Override
    public void run(){
        for (int i=0; i<=5; i++){
            System.err.print("U");
            
             try {
               Hilo2.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Error en la clase hilo 2 " + e);
            }
            
        }
    }
    
}
