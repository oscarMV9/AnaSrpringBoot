package com.gaes4.AStyles.Dtos;

public class CategoriaGeneroDto {

    private Long id;

    private String genero;

    public CategoriaGeneroDto(Long id, String genero) {
        this.id = id;
        this.genero = genero;
    }

    public CategoriaGeneroDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
