package Programas.poo.escenario2.servicio.descuento.impl;

import Programas.poo.escenario2.domain.Producto;
import Programas.poo.escenario2.servicio.descuento.DescuentoService;
import Programas.poo.escenario2.servicio.precio.PrecioService;
import Programas.poo.escenario2.servicio.precio.Impl.PrecioServiceImpl;

public class DescuentoServiceImpl implements DescuentoService {

    private final PrecioService precioService = new PrecioServiceImpl();

    @Override
    public void generarDescuento(Producto producto) {
        //Precio tachado
        producto.setPrecioTachado(precioService.crearPrecioTachado(producto.getPrecioActual()));

        //Precio con descuento
        producto.setPrecioActual(precioService.crearPrecioActual());

        double precioTachado =  producto.getPrecioTachado().getValor();
        double precioActual = producto.getPrecioActual().getValor();

        //= (1 - (online / tachado)) * 100
        int descuento = (int) (100 - ((precioActual*precioTachado) / 100)) ;
        producto.setDescuento(descuento);
    }
}
