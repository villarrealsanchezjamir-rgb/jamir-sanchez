package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class GPS {
    private Long id;
    private String numeroSerie;
    private double latitud;
    private double longitud;
    private double velocidad;
    private String fechaHora;
    private String estado;

    private Vehiculo vehiculo;
    private List<Alerta> alertas;

}
