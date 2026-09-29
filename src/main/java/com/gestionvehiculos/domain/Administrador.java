package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Administrador extends Usuario {
    private String nombre;
    private String usuario;
    private String correo;

    private List<Vehiculo> vehiculosGestionados;
    private List<Conductor> conductoresGestionados;

}
