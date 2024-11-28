package com.gaes4.AStyles.Repositorios;

import com.gaes4.AStyles.Entidades.CategoriaTallas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaTallaRepo extends JpaRepository<CategoriaTallas, Long> {
}
