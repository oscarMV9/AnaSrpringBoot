package com.gaes4.AStyles.Dtos;

public class ProductoDTO {

    private Long idProducto;

    private Long idProduccion;

    private Integer precio;

    public ProductoDTO() {
    }

    public ProductoDTO(Long idProducto, Long idProduccion, Integer precio) {
        this.idProducto = idProducto;
        this.idProduccion = idProduccion;
        this.precio = precio;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Long getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(Long idProduccion) {
        this.idProduccion = idProduccion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
