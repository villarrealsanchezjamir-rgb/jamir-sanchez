package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class SupervisorFlota extends Usuario {
    private String nombre;
    private String dni;
    private String telefono;

    private List<AsignacionVehiculo> asignacionesAutorizadas;
    private List<Viaje> viajesSupervisados;

}
