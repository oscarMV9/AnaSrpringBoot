package com.gaes4.AStyles.Servicios;

import com.gaes4.AStyles.Dtos.CateogoriaColorDto;
import com.gaes4.AStyles.Entidades.CategoriaColor;
import com.gaes4.AStyles.ImplementosServicios.CategoriaColorImpl;
import com.gaes4.AStyles.Repositorios.CategoriaColorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaColorService implements CategoriaColorImpl {

    @Autowired
    private CategoriaColorRepo repositorioCategoriaColor;

    @Override
    public List<CateogoriaColorDto> listaCategorias() {
        return repositorioCategoriaColor.findAll()
                .stream()
                .map(categoriaC -> new CateogoriaColorDto(categoriaC.getId(), categoriaC.getColor()))
                .collect(Collectors.toList());
    }

    @Override
    public CateogoriaColorDto guardarColor(CateogoriaColorDto cateogoriaColorDto) {
        Optional<CategoriaColor> existente = repositorioCategoriaColor.findByColor(cateogoriaColorDto.getColor());
        if (existente.isPresent()) {
            throw new IllegalArgumentException("el color" + cateogoriaColorDto.getColor() + "ya existte en esta catgoria");
        }
        CategoriaColor categoriaColor = new CategoriaColor();
        categoriaColor.setColor(cateogoriaColorDto.getColor());

        CategoriaColor caategoriaGuardada = repositorioCategoriaColor.save(categoriaColor);
        return new CateogoriaColorDto(caategoriaGuardada.getId(), caategoriaGuardada.getColor());
    }
}
