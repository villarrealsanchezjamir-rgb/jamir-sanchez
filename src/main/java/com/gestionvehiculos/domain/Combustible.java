package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Combustible {
    private Long id;
    private String fecha;
    private String tipoCombustible;
    private double cantidad;
    private double precioUnitario;
    private double costoTotal;
    private double kilometraje;

    private Vehiculo vehiculo;

}
