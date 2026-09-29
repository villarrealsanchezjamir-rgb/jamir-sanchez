package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Notificacion {
    private Long id;
    private String mensaje;
    private String fecha;
    private String tipo;
    private String destinatario;
    private String estado;

    private List<Alerta> alertas;

}
