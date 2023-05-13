package Programas.poo.escenario2.servicio.precio.Impl;

import Programas.poo.escenario2.domain.PrecioActual;
import Programas.poo.escenario2.domain.PrecioTachado;
import Programas.poo.escenario2.servicio.entrada.InputService;
import Programas.poo.escenario2.servicio.precio.PrecioService;

import java.time.LocalDateTime;

public class PrecioServiceImpl implements PrecioService {


    @Override
    public PrecioActual crearPrecioActual(double precioNuevo) {
        PrecioActual precioActual = new PrecioActual();

        precioActual.setValor(precioNuevo);
        precioActual.setFechaDeCarga(LocalDateTime.now());
        return precioActual;
    }

    @Override
    public PrecioActual crearPrecioActual() {

        PrecioActual precioActual = new PrecioActual();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : ");
        precioActual.setValor(InputService.getScanner().nextDouble());
        precioActual.setFechaDeCarga(LocalDateTime.now());


        return precioActual;
    }

    @Override
    public PrecioTachado crearPrecioTachado(PrecioActual precioActual) {



        PrecioTachado precioTachado = new PrecioTachado();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : ");
        precioTachado.setValor(InputService.getScanner().nextDouble());
        precioTachado.setFechaDeCarga(LocalDateTime.now());
        precioTachado.setFechaDeFinalizacion(LocalDateTime.of(2024,5,10,0,0,0));

        return precioTachado;
    }
}