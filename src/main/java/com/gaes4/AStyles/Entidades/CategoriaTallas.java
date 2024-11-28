package com.gaes4.AStyles.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "categoria_tallas")
//@AllArgsConstructor
//@NoArgsConstructor
public class CategoriaTallas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String talla;

    @OneToMany(mappedBy = "categoriaTallas")
    private List<Produccion> produccions;

    public CategoriaTallas(Long id, List<Produccion> produccions, String talla) {
        this.id = id;
        this.produccions = produccions;
        this.talla = talla;
    }

    public CategoriaTallas() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Produccion> getProduccions() {
        return produccions;
    }

    public void setProduccions(List<Produccion> produccions) {
        this.produccions = produccions;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
