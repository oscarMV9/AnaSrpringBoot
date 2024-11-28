package com.gaes4.AStyles.Repositorios;

import com.gaes4.AStyles.Entidades.CategoriaTallas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaTallaRepo extends JpaRepository<CategoriaTallas, Long> {
    Optional<CategoriaTallas> findByTalla(String talla);
}
