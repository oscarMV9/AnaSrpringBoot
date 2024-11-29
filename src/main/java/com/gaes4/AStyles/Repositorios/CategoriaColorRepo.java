package com.gaes4.AStyles.Repositorios;

import com.gaes4.AStyles.Entidades.CategoriaColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaColorRepo extends JpaRepository<CategoriaColor, Long> {
    Optional<CategoriaColor> findByColor(String color);
}
