package com.gaes4.AStyles.Dtos;

public class CategoriaTallasDto {

    private Long id;

    private String talla;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public CategoriaTallasDto(Long id, String talla) {
        this.id = id;
        this.talla = talla;
    }

    public CategoriaTallasDto() {
    }
}
