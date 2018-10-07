package centro_comercial;

public class Centro_Comercial {

    public static void main(String[] args) {
        
        long tiempoInicio = System.currentTimeMillis();
        
        System.out.println("Iniciando ejecución...");
        
        Cliente cliente1 = new Cliente("Cliente 01 María", 100000);
	Cliente cliente2 = new Cliente("Cliente 02 Jóse", 100000);
        Cliente cliente3 = new Cliente("Cliente 03 Pablo", 100000);
        Cliente cliente4 = new Cliente("Cliente 04 Daniela", 100000);
        

        Caja cajera1 = new Caja("Cajera 01 Isabel");
        
        cajera1.ordenar(cliente1);
        cajera1.ordenar(cliente2);
        cajera1.ordenar(cliente3);
        cajera1.ordenar(cliente4);
       
        
        long tiempoFinal = System.currentTimeMillis();
        
        long tiempoEjecucion = (tiempoFinal-tiempoInicio);
        
        System.out.println("\nTiempo de ejecución: "+(tiempoEjecucion/1000)+ " segundos. ");
        
 
    }  
}
