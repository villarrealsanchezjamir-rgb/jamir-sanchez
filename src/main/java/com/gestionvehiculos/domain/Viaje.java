package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Viaje {
    private Long id;
    private String fechaSalida;
    private String fechaLlegada;
    private String origen;
    private String destino;
    private double kilometrajeInicial;
    private double kilometrajeFinal;
    private String estado;

    private Vehiculo vehiculo;
    private Conductor conductor;
    private Ruta ruta;

}
