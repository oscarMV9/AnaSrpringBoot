package com.gaes4.AStyles.Repositorios;

import com.gaes4.AStyles.Entidades.CategoriaColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaColorRepo extends JpaRepository<CategoriaColor, Long> {
}
