package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class MantenimientoCorrectivo extends Mantenimiento {
    private Long id;
    private String fallaDetectada;
    private String fechaReporte;
    private String fechaReparacion;
    private String diagnostico;
    private double costo;
    private String estado;

    private List<Repuesto> repuestos;

}
