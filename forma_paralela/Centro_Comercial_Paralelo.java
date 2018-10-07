package centro_comercial_paralelo;

public class Centro_Comercial_Paralelo {
    
    public static void main(String[] args) throws InterruptedException {
        
        long tiempoInicio = System.currentTimeMillis();
       
        System.out.println("Iniciando ejecución...");
        
        Cliente cliente1 = new Cliente("Cliente 01 María", 100000);
	Cliente cliente2 = new Cliente("Cliente 02 Jóse", 100000);
        Cliente cliente3 = new Cliente("Cliente 03 Pablo", 100000);
        Cliente cliente4 = new Cliente("Cliente 04 Daniela", 100000);
        
        
        Thread cajera1 = new Caja(cliente1,"Cajera 01 Isabel");
        cajera1.start();
        
        Thread cajera2 = new Caja(cliente2,"Cajera 02 Gabriela");
        cajera2.start();
        
        Thread cajera3 = new Caja(cliente3,"Cajera 03 Lucero");
        cajera3.start();
        
        Thread cajera4 = new Caja(cliente4,"Cajera 04 Karime");
        cajera4.start();
        
        cajera1.join();
        cajera2.join();
        cajera3.join();
        cajera4.join();
        
        long tiempoFinal = System.currentTimeMillis();
        
        long tiempoEjecucion = (tiempoFinal-tiempoInicio);
        
        System.out.println("\nTiempo de ejecución: "+(tiempoEjecucion/1000)+ " segundos. ");

    }
}
