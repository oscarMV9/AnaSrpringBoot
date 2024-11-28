package com.gaes4.AStyles.Repositorios;

import com.gaes4.AStyles.Entidades.CategoriaColor;
import com.gaes4.AStyles.Entidades.CategoriaPrenda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriaPrendasRepo extends JpaRepository<CategoriaPrenda, Long> {
    Optional<CategoriaPrenda> findByNombrePrenda(String nombrePrenda);
}
