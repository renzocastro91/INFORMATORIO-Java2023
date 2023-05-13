package Programas.poo.escenario2.servicio.precio;

import Programas.poo.escenario2.domain.PrecioActual;
import Programas.poo.escenario2.domain.PrecioTachado;

public interface PrecioService {

    PrecioActual crearPrecioActual(double precioNuevo);
    PrecioActual crearPrecioActual();
    PrecioTachado crearPrecioTachado(PrecioActual precioActual);
}