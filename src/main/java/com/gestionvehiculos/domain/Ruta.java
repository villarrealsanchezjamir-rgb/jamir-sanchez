package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Ruta {
    private Long id;
    private String nombre;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEstimado;
    private String estado;

    private List<Viaje> viajes;

}
