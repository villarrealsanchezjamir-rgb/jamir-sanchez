package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class AsignacionVehiculo {
    private Long id;
    private String fechaInicio;
    private String fechaFin;
    private String motivo;
    private String estado;

    private Vehiculo vehiculo;
    private Conductor conductor;
    private AreaOperativa areaOperativa;

}
