
package centro_comercial_paralelo;

import java.util.Arrays;

public class Cliente {
    
    private String nombre;
    private int articulos;
    int carrito[];
    
    public Cliente(String nombre, int articulos){
        this.nombre = nombre;
        this.articulos = articulos;
    }
    
    public void printCarrito(){
        System.out.println(Arrays.toString(carrito));
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int[] getCarrito(){
        int [] carrito = new int[articulos];
        for(int i = 0 ; i < carrito.length; i++){
            carrito[i] = 0 + (int)(Math.random() * ((100000 - 0) + 1));
            //System.out.println(i);
        }
        return carrito;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void SetCarrito(int[] carrito){
        this.carrito = carrito;
    }    
}
