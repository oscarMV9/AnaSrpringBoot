package com.gaes4.AStyles.ImplementosServicios;

import com.gaes4.AStyles.Dtos.CategoriaGeneroDto;

import java.util.List;

public interface CategoriaGeneroImpl {

    List<CategoriaGeneroDto> listaGeneroC();

    CategoriaGeneroDto guardarGenero(CategoriaGeneroDto categoriaGeneroDto);

}
