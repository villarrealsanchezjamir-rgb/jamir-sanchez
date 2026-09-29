package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Alerta {
    private Long id;
    private String tipo;
    private String mensaje;
    private String fecha;
    private String prioridad;
    private String estado;

    private Vehiculo vehiculo;
    private List<Notificacion> notificaciones;

}
