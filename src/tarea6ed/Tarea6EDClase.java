package tarea6ed;

public class Tarea6EDClase {
    
    //creación de constantes para la refactorización de extracción de constante
    private static final int LIMITE_DESCUENTO = 3;
    private static final int GRAN_DESCUENTO = 5;
    private static final double DESCUENTO_NORMAL = 0.95;
    private static final double DESCUENTO_POR_MUCHOS_PRODUCTOS = 0.8;
    
    //refactorización de renombrar, tanto el nombre del método como de la variable numProductos
    public void calcularPrecioFinal(double precioProducto, int numeroProductos){     double Total;
        precioProducto = aplicarDescuento(numeroProductos, precioProducto);
            if (numeroProductos!=0){
            Total = precioProducto*DESCUENTO_POR_MUCHOS_PRODUCTOS;
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }else {
            Total = precioProducto*DESCUENTO_NORMAL;
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }   
    }
    //Refactorización de extración de método. Se ha extraído el método para aplicar el descuento
    private double aplicarDescuento(int numeroProductos, double precioProducto) {
        if(numeroProductos>LIMITE_DESCUENTO)
            precioProducto-=GRAN_DESCUENTO;
        return precioProducto;
    }
}