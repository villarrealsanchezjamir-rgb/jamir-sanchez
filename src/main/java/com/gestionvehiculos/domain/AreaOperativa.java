package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class AreaOperativa {
    private Long id;
    private String nombre;
    private String descripcion;
    private String ubicacion;

    private Empresa empresa;
    private List<Vehiculo> vehiculos;
    private List<AsignacionVehiculo> asignaciones;

}
