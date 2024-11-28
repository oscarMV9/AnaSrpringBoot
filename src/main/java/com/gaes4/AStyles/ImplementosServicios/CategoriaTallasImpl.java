package com.gaes4.AStyles.ImplementosServicios;

import com.gaes4.AStyles.Dtos.CategoriaTallasDto;

import java.util.List;

public interface CategoriaTallasImpl {

    List<CategoriaTallasDto> listaCategoriasT();

    CategoriaTallasDto GuardarCategoria(CategoriaTallasDto categoriaTallasDto);
}
