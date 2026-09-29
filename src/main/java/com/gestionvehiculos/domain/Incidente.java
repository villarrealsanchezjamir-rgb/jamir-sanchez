package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Incidente {
    private Long id;
    private String fecha;
    private String tipo;
    private String descripcion;
    private String gravedad;
    private String ubicacion;
    private String estado;

    private Vehiculo vehiculo;
    private Conductor conductor;

}
