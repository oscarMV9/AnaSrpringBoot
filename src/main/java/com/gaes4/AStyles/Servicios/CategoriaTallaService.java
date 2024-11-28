package com.gaes4.AStyles.Servicios;

import com.gaes4.AStyles.Dtos.CategoriaTallasDto;
import com.gaes4.AStyles.Entidades.CategoriaTallas;
import com.gaes4.AStyles.ImplementosServicios.CategoriaTallasImpl;
import com.gaes4.AStyles.Repositorios.CategoriaTallaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaTallaService implements CategoriaTallasImpl {

    @Autowired
    private CategoriaTallaRepo repositorioCategoriasTallas;

    @Override
    public List<CategoriaTallasDto> listaCategoriasT() {
        return repositorioCategoriasTallas.findAll()
                .stream()
                .map(categoriaT -> new CategoriaTallasDto(categoriaT.getId(), categoriaT.getTalla()))
                .collect(Collectors.toList());
    }

    @Override
    public CategoriaTallasDto GuardarCategoria(CategoriaTallasDto categoriaTallasDto) {
        Optional<CategoriaTallas> existente = repositorioCategoriasTallas.findByTalla(categoriaTallasDto.getTalla());
        if (existente.isPresent()) {
            throw new IllegalArgumentException("esta talla" + categoriaTallasDto.getTalla() + "ya existe");
        }

        CategoriaTallas categoriaTallas = new CategoriaTallas();
        categoriaTallas.setTalla(categoriaTallasDto.getTalla());

        CategoriaTallas guardarTalla = repositorioCategoriasTallas.save(categoriaTallas);
        return new CategoriaTallasDto(guardarTalla.getId(), guardarTalla.getTalla());
    }
}
