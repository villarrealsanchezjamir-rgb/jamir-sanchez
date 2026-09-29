package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Taller {
    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String tipo;
    private String estado;

    private List<Mantenimiento> mantenimientos;

}
