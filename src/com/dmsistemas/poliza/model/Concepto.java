package com.dmsistemas.poliza.model;

import java.math.BigDecimal;

public class Concepto implements java.io.Serializable {

    private int id;
    private String descripcion;
    private String uuid;
    private BigDecimal precioUnitario;
    private String cantidad;
    private String unidad;
    private String claveUnidad;
    private BigDecimal importe;
    private String claveProd;

    public Concepto() {
    }

    public Concepto(int id) {
        this.id = id;
    }

    public Concepto(int id, String descripcion, String uuid, BigDecimal precioUnitario, String cantidad, String unidad, String claveUnidad, BigDecimal importe, String claveProd) {
        this.id = id;
        this.descripcion = descripcion;
        this.uuid = uuid;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.claveUnidad = claveUnidad;
        this.importe = importe;
        this.claveProd = claveProd;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public BigDecimal getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return this.unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getClaveUnidad() {
        return this.claveUnidad;
    }

    public void setClaveUnidad(String claveUnidad) {
        this.claveUnidad = claveUnidad;
    }

    public BigDecimal getImporte() {
        return this.importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public String getClaveProd() {
        return this.claveProd;
    }

    public void setClaveProd(String claveProd) {
        this.claveProd = claveProd;
    }

}
