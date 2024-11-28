package com.gaes4.AStyles.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "categoria_genero")
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaGenero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String genero;

    @OneToMany(mappedBy = "categoriaGenero")
    private List<Produccion> produccions;
}
