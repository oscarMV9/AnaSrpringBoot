package com.gaes4.AStyles.ImplementosServicios;

import com.gaes4.AStyles.Dtos.CateogoriaColorDto;

import java.util.List;

public interface CategoriaColorImpl {

    List<CateogoriaColorDto> listaCategorias();

    CateogoriaColorDto guardarColor(CateogoriaColorDto cateogoriaColorDto);

}
