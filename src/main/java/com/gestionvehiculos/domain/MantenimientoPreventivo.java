package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class MantenimientoPreventivo extends Mantenimiento {
    private Long id;
    private double kilometrajeProgramado;
    private String fechaProgramada;
    private String actividades;
    private double costoEstimado;
    private String estado;

    private List<Alerta> alertas;

}
