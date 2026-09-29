package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Empresa {
    private Long id;
    private String razonSocial;
    private String ruc;
    private String direccion;
    private String telefono;
    private String correo;

    private List<AreaOperativa> areasOperativas;
    private List<Vehiculo> vehiculos;

}
