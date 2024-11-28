package com.gaes4.AStyles.Repositorios;

import com.gaes4.AStyles.Entidades.CategoriaGenero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriasGeneroRepo extends JpaRepository<CategoriaGenero, Long> {
    Optional<CategoriaGenero> findByGenero(String genero);
}
