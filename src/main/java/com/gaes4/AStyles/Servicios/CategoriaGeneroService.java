package com.gaes4.AStyles.Servicios;

import com.gaes4.AStyles.Dtos.CategoriaGeneroDto;
import com.gaes4.AStyles.Entidades.CategoriaGenero;
import com.gaes4.AStyles.ImplementosServicios.CategoriaGeneroImpl;
import com.gaes4.AStyles.Repositorios.CategoriasGeneroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaGeneroService implements CategoriaGeneroImpl {

    @Autowired
    private CategoriasGeneroRepo repositorioGenero;

    @Override
    public List<CategoriaGeneroDto> listaGeneroC() {
        // identificar la entidad
        return repositorioGenero.findAll()
                // buscar entidad con .stream
                .stream()
                //mapear la entidad por el Dto
                .map(categoriaG -> new CategoriaGeneroDto(categoriaG.getId(), categoriaG.getGenero()))
                .collect(Collectors.toList());
    }

    @Override
    public CategoriaGeneroDto guardarGenero(CategoriaGeneroDto categoriaGeneroDto) {
        Optional<CategoriaGenero> existente = repositorioGenero.findByGenero(categoriaGeneroDto.getGenero());
        if (existente.isPresent()) {
            throw new IllegalArgumentException("el genero" + categoriaGeneroDto.getGenero() + "ya existe");
        }
        CategoriaGenero categoriaGenero = new CategoriaGenero();
        categoriaGenero.setGenero(categoriaGeneroDto.getGenero());

        CategoriaGenero categoriaGuardar = repositorioGenero.save(categoriaGenero);
        return new CategoriaGeneroDto(categoriaGuardar.getId(), categoriaGuardar.getGenero());
    }
}
