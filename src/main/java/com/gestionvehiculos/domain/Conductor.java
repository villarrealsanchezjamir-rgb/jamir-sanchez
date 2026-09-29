package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Conductor {
    private Long id;
    private String nombre;
    private String dni;
    private String licencia;
    private String categoriaLicencia;
    private String telefono;
    private String correo;
    private String estado;

    private List<AsignacionVehiculo> asignaciones;
    private List<Viaje> viajes;
    private List<Incidente> incidentes;

}
