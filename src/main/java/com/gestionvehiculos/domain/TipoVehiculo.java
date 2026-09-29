package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class TipoVehiculo {
    private Long id;
    private String nombre;
    private String descripcion;
    private double capacidad;

    private List<Vehiculo> vehiculos;

}
