package dto;

public class HiloEjemplo extends Thread{
    private int c; 
    private int hilo;

    public HiloEjemplo(int hilo){
         this.hilo = hilo;
         System.out.println("CREANDO HILO: " + hilo);
    }
    public void run(){
         c = 0;
         while (c <= 5){
               System.out.println("Hilo: " + hilo + " C = " + c);
               c++;
         }
    }

}
