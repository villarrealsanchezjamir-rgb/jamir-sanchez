package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class DocumentoVehicular {
    private Long id;
    private String tipo;
    private String numero;
    private String fechaEmision;
    private String fechaVencimiento;
    private String estado;

    private Vehiculo vehiculo;
    private List<Alerta> alertas;

}
