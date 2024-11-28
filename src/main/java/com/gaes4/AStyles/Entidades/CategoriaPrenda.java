package com.gaes4.AStyles.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "categoria_prendas")
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaPrenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String nombrePrenda;

    @OneToMany(mappedBy = "categoriaPrenda")
    private List<Produccion> produccions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public List<Produccion> getProduccions() {
        return produccions;
    }

    public void setProduccions(List<Produccion> produccions) {
        this.produccions = produccions;
    }
}
