package centro_comercial;

public class Caja {
    
    String nombre;
    Cliente cliente;
    int total;
    int[]carrito;
    int aux;

    public Caja(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int[] ordenar(Cliente cliente){
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
        return carrito;
    }
}
