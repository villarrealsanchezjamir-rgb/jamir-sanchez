package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Mecanico extends Usuario {
    private String nombre;
    private String dni;
    private String especialidad;
    private String telefono;
    private String certificacion;

    private List<Mantenimiento> mantenimientosEjecutados;
    private List<Repuesto> repuestosUtilizados;

}
