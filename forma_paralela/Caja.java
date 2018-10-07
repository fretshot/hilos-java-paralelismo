package centro_comercial_paralelo;

public class Caja extends Thread{
    
    String nombre;
    Cliente cliente;
    int total;
    int[]carrito;
    int aux;
    

    public Caja(Cliente cliente, String nombre){
        this.nombre = nombre;
        this.cliente = cliente;
    }
    
    @Override
    public void run(){
         long timeStamp = System.currentTimeMillis();
        //System.out.println(this.nombre + " comienza a ordenar al " + cliente.getNombre());
        carrito = cliente.getCarrito();
        for(int j = 0; j < carrito.length; j++){
            for(int i = 0; i < carrito.length-j-1; i++){
		 if(carrito[i]>carrito[i+1]){
                    aux=carrito[i+1];
                    carrito[i+1]=carrito[i];
                    carrito[i]=aux;
		 }
            }
	} 
        System.out.println(this.nombre + " terminó de ordenar al " + cliente.getNombre()+" en un tiempo de "+ (System.currentTimeMillis() - timeStamp) / 1000+" segundos");
        //System.out.println("Carrito: "+Arrays.toString(carrito));
    }
}

