package Programas.poo.escenario2.servicio.producto.Impl;

import Programas.poo.escenario2.domain.Producto;
import Programas.poo.escenario2.domain.PrecioActual;
import Programas.poo.escenario2.servicio.descuento.DescuentoService;
import Programas.poo.escenario2.servicio.descuento.impl.DescuentoServiceImpl;
import Programas.poo.escenario2.servicio.entrada.InputService;
import Programas.poo.escenario2.servicio.precio.PrecioService;
import Programas.poo.escenario2.servicio.precio.Impl.PrecioServiceImpl;
import Programas.poo.escenario2.servicio.producto.ServicioProducto;

import java.util.UUID;

public class ServicioProductoImpl implements ServicioProducto {

    private final DescuentoService descuentoService = new DescuentoServiceImpl();

    private final PrecioService precioService = new PrecioServiceImpl();

    @Override
    public Producto crearProducto() {
        Producto productoNuevo = new Producto();

        productoNuevo.setId(UUID.randomUUID());

        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO : ");
        // String nombreProducto = entrada.nextLine(); Es lo mismo
        productoNuevo.setNombre(InputService.scanner.nextLine());
        System.out.println("INGRESE LA DESCRIPCION DEL PRODUCTO : ");
        productoNuevo.setDescripcion(InputService.scanner.nextLine());

        PrecioActual precioActual = precioService.crearPrecioActual();
        productoNuevo.setPrecioActual(precioActual);

        System.out.println("TIENE DESCUENTO? Si ingrese 1 - No ingrese 0: ");
        int quieroDescuento = InputService.scanner.nextInt();

        if (quieroDescuento == 1){
            //Envio de mensaje
            descuentoService.generarDescuento(productoNuevo);
        }

        return productoNuevo;
    }

}