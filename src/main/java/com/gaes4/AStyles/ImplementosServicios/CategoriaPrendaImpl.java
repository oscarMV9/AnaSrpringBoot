package com.gaes4.AStyles.ImplementosServicios;

import com.gaes4.AStyles.Dtos.CategoriaPrendaDto;

import java.util.List;

public interface CategoriaPrendaImpl {

    List<CategoriaPrendaDto> listaprendasC();

    CategoriaPrendaDto guardarGenero(CategoriaPrendaDto categoriaPrendaDto);

}
