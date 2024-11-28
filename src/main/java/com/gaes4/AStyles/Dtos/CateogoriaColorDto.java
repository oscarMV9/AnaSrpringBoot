package com.gaes4.AStyles.Dtos;

public class CateogoriaColorDto {

    private Long id;

    private String color;

    public CateogoriaColorDto(Long id, String color) {
        this.id = id;
        this.color = color;
    }

    public CateogoriaColorDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
