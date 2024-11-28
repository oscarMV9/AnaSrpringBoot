package com.gaes4.AStyles.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "categoria_color")
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String color;

    @OneToMany(mappedBy = "categoriaColor")
    private List<Produccion> produccions;

}
