package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Repuesto {
    private Long id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private double precio;
    private int stockMinimo;

    private List<Mantenimiento> mantenimientos;

}
