package com.gaes4.AStyles.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "productos")
@AllArgsConstructor
@NoArgsConstructor
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @ManyToOne
    @JoinColumn(name = "nombreProducto", nullable = false)
    private Produccion produccion;

    @OneToMany
    @JoinColumn(name = "id_Talla", nullable = false)
    private CategoriaTallas categoriaTallas;

    @OneToMany
    @JoinColumn(name = "id_color", nullable = false)
    private CategoriaColor categoriaColor;

    @OneToMany
    @JoinColumn(name = "id_tipPrenda", nullable = false)
    private CategoriaPrenda categoriaPrenda;

    @OneToMany
    @JoinColumn(name = "id_genero", nullable = false)
    private CategoriaGenero categoriaGenero;

}
