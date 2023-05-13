package Programas.poo.escenario2;

import Programas.poo.escenario2.servicio.entrada.InputService;
import Programas.poo.escenario2.inicializacion.InitService;
import Programas.poo.escenario2.servicio.producto.ServicioProducto;
import Programas.poo.escenario2.servicio.producto.Impl.ServicioProductoImpl;

public class App {

    //Atributo global
    private static final ServicioProducto servicioProducto = new ServicioProductoImpl();

    public static void main(String[] args) {

        InitService.initCategories();

        InputService.createScanner();
        System.out.println(servicioProducto.crearProducto().toString());
        InputService.closeScanner();
    }

}