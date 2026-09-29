package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Seguro {
    private Long id;
    private String numeroPoliza;
    private String aseguradora;
    private String fechaInicio;
    private String fechaVencimiento;
    private String cobertura;
    private double costo;
    private String estado;

    private Vehiculo vehiculo;
    private List<Alerta> alertas;

}
