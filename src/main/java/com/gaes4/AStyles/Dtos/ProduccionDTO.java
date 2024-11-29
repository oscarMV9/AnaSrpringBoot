package com.gaes4.AStyles.Dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProduccionDTO {

    private Long idProduccion;

    private String nombreProducto;

    private String nombreProveedor;

    private Long id_tallas;

    private Long id_color;

    private Long id_tipPrenda;

    private Long id_genero;

    private Integer cantidad;

    private String materiales;

    private BigDecimal costo;

    private String EstadoProduccion;

    private LocalDate FinalizacionProduccion;

    private Long Productos;

    public ProduccionDTO() {
    }

    public ProduccionDTO(Long idProduccion, String nombreProducto, String nombreProveedor, Long id_tallas, Long id_color, Long id_tipPrenda, Long id_genero, Integer cantidad, String materiales, BigDecimal costo, String estadoProduccion, LocalDate finalizacionProduccion, Long productos) {
        this.idProduccion = idProduccion;
        this.nombreProducto = nombreProducto;
        this.nombreProveedor = nombreProveedor;
        this.id_tallas = id_tallas;
        this.id_color = id_color;
        this.id_tipPrenda = id_tipPrenda;
        this.id_genero = id_genero;
        this.cantidad = cantidad;
        this.materiales = materiales;
        this.costo = costo;
        EstadoProduccion = estadoProduccion;
        FinalizacionProduccion = finalizacionProduccion;
        Productos = productos;
    }

    public Long getIdProduccion() {

        return idProduccion;
    }

    public void setIdProduccion(Long idProduccion) {
        this.idProduccion = idProduccion;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Long getId_tallas() {
        return id_tallas;
    }

    public void setId_tallas(Long id_tallas) {
        this.id_tallas = id_tallas;
    }

    public Long getId_color() {
        return id_color;
    }

    public void setId_color(Long id_color) {
        this.id_color = id_color;
    }

    public Long getId_tipPrenda() {
        return id_tipPrenda;
    }

    public void setId_tipPrenda(Long id_tipPrenda) {
        this.id_tipPrenda = id_tipPrenda;
    }

    public Long getId_genero() {
        return id_genero;
    }

    public void setId_genero(Long id_genero) {
        this.id_genero = id_genero;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public LocalDate getFinalizacionProduccion() {
        return FinalizacionProduccion;
    }

    public void setFinalizacionProduccion(LocalDate finalizacionProduccion) {
        FinalizacionProduccion = finalizacionProduccion;
    }

    public String getEstadoProduccion() {
        return EstadoProduccion;
    }

    public void setEstadoProduccion(String estadoProduccion) {
        EstadoProduccion = estadoProduccion;
    }

    public Long getProductos() {
        return Productos;
    }

    public void setProductos(Long productos) {
        Productos = productos;
    }
}
