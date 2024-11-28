package com.gaes4.AStyles.Dtos;

public class CategoriaPrendaDto {

    private Long id;

    private String nombrePrenda;

    public CategoriaPrendaDto(Long id, String nombrePrenda) {
        this.id = id;
        this.nombrePrenda = nombrePrenda;
    }

    public CategoriaPrendaDto() {
    }

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
}
