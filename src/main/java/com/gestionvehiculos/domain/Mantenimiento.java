package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Mantenimiento {
    private Long id;
    private String fechaSolicitud;
    private String fechaInicio;
    private String fechaFin;
    private String tipo;
    private String descripcion;
    private double costo;
    private String estado;

    private Vehiculo vehiculo;
    private List<Repuesto> repuestos;
    private Taller taller;
    private MantenimientoPreventivo preventivo;
    private MantenimientoCorrectivo correctivo;

}
