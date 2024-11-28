package com.gaes4.AStyles.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "produccion")
@AllArgsConstructor
@NoArgsConstructor
public class Produccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduccion;

    @Column(nullable = false, length = 40)
    private String nombreProducto;

    @Column(nullable = false, length = 60)
    private String nombreProveedor;

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

}
