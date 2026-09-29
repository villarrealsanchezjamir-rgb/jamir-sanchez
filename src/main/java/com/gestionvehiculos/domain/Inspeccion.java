package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Inspeccion {
    private Long id;
    private String fecha;
    private String tipo;
    private double kilometraje;
    private String resultado;
    private String observaciones;
    private String estado;

    private Vehiculo vehiculo;
    private Conductor conductor;

}
