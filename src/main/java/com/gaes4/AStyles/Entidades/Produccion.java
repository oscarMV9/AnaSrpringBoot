package com.gaes4.AStyles.Entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "produccion")
public class Produccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduccion;

    @Column(nullable = false, length = 40)
    private String nombreProducto;

    @Column(nullable = false, length = 60)
    private String nombreProveedor;

    @ManyToOne
    @JoinColumn(name = "id_Talla", nullable = false)
    private CategoriaTallas categoriaTallas;

    @ManyToOne
    @JoinColumn(name = "id_color", nullable = false)
    private CategoriaColor categoriaColor;

    @ManyToOne
    @JoinColumn(name = "id_tipPrenda", nullable = false)
    private CategoriaPrenda categoriaPrenda;

    @ManyToOne
    @JoinColumn(name = "id_genero", nullable = false)
    private CategoriaGenero categoriaGenero;

    @Column(nullable = false, length = 240)
    private int cantidad;

    @Column(nullable = false, length = 70)
    private String materiales;

    @Column(nullable = false, length = 240)
    private BigDecimal costoProduccion;

    @Column(nullable = false, length = 50)
    private String EstadoProduccion;

    @Column(nullable = false, length = 60)
    private LocalDate FinalizacionProduccion;

    @OneToMany(mappedBy = "produccion")
    private List<Productos> productos;

    public Produccion() {
    }

    public Produccion(Long idProduccion, String nombreProducto, String nombreProveedor, CategoriaColor categoriaColor, CategoriaTallas categoriaTallas, CategoriaPrenda categoriaPrenda, int cantidad, CategoriaGenero categoriaGenero, String materiales, BigDecimal costoProduccion, String estadoProduccion, LocalDate finalizacionProduccion, List<Productos> productos) {
        this.idProduccion = idProduccion;
        this.nombreProducto = nombreProducto;
        this.nombreProveedor = nombreProveedor;
        this.categoriaColor = categoriaColor;
        this.categoriaTallas = categoriaTallas;
        this.categoriaPrenda = categoriaPrenda;
        this.cantidad = cantidad;
        this.categoriaGenero = categoriaGenero;
        this.materiales = materiales;
        this.costoProduccion = costoProduccion;
        EstadoProduccion = estadoProduccion;
        FinalizacionProduccion = finalizacionProduccion;
        this.productos = productos;
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

    public CategoriaTallas getCategoriaTallas() {
        return categoriaTallas;
    }

    public void setCategoriaTallas(CategoriaTallas categoriaTallas) {
        this.categoriaTallas = categoriaTallas;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public CategoriaColor getCategoriaColor() {
        return categoriaColor;
    }

    public void setCategoriaColor(CategoriaColor categoriaColor) {
        this.categoriaColor = categoriaColor;
    }

    public CategoriaPrenda getCategoriaPrenda() {
        return categoriaPrenda;
    }

    public void setCategoriaPrenda(CategoriaPrenda categoriaPrenda) {
        this.categoriaPrenda = categoriaPrenda;
    }

    public CategoriaGenero getCategoriaGenero() {
        return categoriaGenero;
    }

    public void setCategoriaGenero(CategoriaGenero categoriaGenero) {
        this.categoriaGenero = categoriaGenero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public BigDecimal getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(BigDecimal costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    public String getEstadoProduccion() {
        return EstadoProduccion;
    }

    public void setEstadoProduccion(String estadoProduccion) {
        EstadoProduccion = estadoProduccion;
    }

    public LocalDate getFinalizacionProduccion() {
        return FinalizacionProduccion;
    }

    public void setFinalizacionProduccion(LocalDate finalizacionProduccion) {
        FinalizacionProduccion = finalizacionProduccion;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }
}
