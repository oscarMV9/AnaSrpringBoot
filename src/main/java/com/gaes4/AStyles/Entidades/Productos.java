package com.gaes4.AStyles.Entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Data
@Table(name = "productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @ManyToOne
    @JoinColumn(name = "id_produccion", nullable = false)
    private Produccion produccion;

    @Column(length = 100 ,nullable = false)
    private Integer precio;

    public Productos() {
    }

    public Productos(Long idProducto, Produccion produccion, Integer precio) {
        this.idProducto = idProducto;
        this.produccion = produccion;
        this.precio = precio;
    }


    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Produccion getProduccion() {
        return produccion;
    }

    public void setProduccion(Produccion produccion) {
        this.produccion = produccion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
