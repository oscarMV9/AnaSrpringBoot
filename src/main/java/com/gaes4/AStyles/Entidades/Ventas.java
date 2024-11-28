package com.gaes4.AStyles.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "ventas")
@AllArgsConstructor
@NoArgsConstructor
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;

    @ManyToOne
    @JoinColumn(name = "id_venta", nullable = false)
    private Clientes clientes;

    @OneToOne(mappedBy = "ventas", cascade = CascadeType.ALL)
    private Logistica logistica;

    private BigDecimal precioTotal;

    private Integer cantidad;

    private LocalDateTime fechaVenta;

    public Logistica getLogistica() {
        return logistica;
    }

    public void setLogistica(Logistica logistica) {
        this.logistica = logistica;
    }

    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public BigDecimal getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(BigDecimal precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @PrePersist
    public void crearLogistica() {
        Logistica logistica = new Logistica();
        logistica.setVentas(this);
        logistica.setEstadoEnvio("en preparacion");
        logistica.setCostoEnvio(BigDecimal.ZERO);
        logistica.setIdentificacionCliente(clientes.getIdentificacion());
        logistica.setNombreCliente(clientes.getFullName());
        logistica.setDireccionCliente(clientes.getDireccion());

        this.setLogistica(logistica);
    }

}
