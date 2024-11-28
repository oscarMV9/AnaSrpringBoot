package com.gaes4.AStyles.Servicios;

import com.gaes4.AStyles.Dtos.CategoriaPrendaDto;
import com.gaes4.AStyles.Entidades.CategoriaPrenda;
import com.gaes4.AStyles.ImplementosServicios.CategoriaPrendaImpl;
import com.gaes4.AStyles.Repositorios.CategoriaPrendasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaPrendaService implements CategoriaPrendaImpl {

    @Autowired
    private CategoriaPrendasRepo repositorioPrendas;

    @Override
    public List<CategoriaPrendaDto> listaprendasC() {
        return repositorioPrendas.findAll()
                .stream()
                .map(categoriaP -> new CategoriaPrendaDto(categoriaP.getId(), categoriaP.getNombrePrenda()))
                .collect(Collectors.toList());
    }

    @Override
    public CategoriaPrendaDto guardarGenero(CategoriaPrendaDto categoriaPrendaDto) {
        Optional<CategoriaPrenda> existente = repositorioPrendas.findByNombrePrenda(categoriaPrendaDto.getNombrePrenda());
        if (existente.isPresent()) {
            throw new IllegalArgumentException("la Categoria para la prenda" + categoriaPrendaDto.getNombrePrenda() + "ya existe");
        }
        CategoriaPrenda categoriaPrenda = new CategoriaPrenda();
        categoriaPrenda.setNombrePrenda(categoriaPrendaDto.getNombrePrenda());

        CategoriaPrenda guardarCategoria = repositorioPrendas.save(categoriaPrenda);
        return new CategoriaPrendaDto(guardarCategoria.getId(), guardarCategoria.getNombrePrenda());
    }
}
