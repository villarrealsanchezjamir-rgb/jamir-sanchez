package com.gestionvehiculos.domain;

import java.util.List;

/** Modelo de dominio del Sistema Integral de Gestión de Flota Vehicular. */
public class Vehiculo {
    private Long id;
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private double capacidad;
    private double kilometraje;
    private String estado;

    private Empresa empresa;
    private AreaOperativa areaOperativa;
    private TipoVehiculo tipo;
    private List<AsignacionVehiculo> asignaciones;
    private List<Viaje> viajes;
    private List<Mantenimiento> mantenimientos;
    private List<Combustible> consumos;
    private List<DocumentoVehicular> documentos;
    private List<Seguro> seguros;
    private List<Inspeccion> inspecciones;
    private List<Incidente> incidentes;
    private List<GPS> dispositivosGps;
    private List<Alerta> alertas;

}
