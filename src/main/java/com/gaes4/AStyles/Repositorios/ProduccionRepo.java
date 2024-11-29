package com.gaes4.AStyles.Repositorios;

import com.gaes4.AStyles.Entidades.Produccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduccionRepo extends JpaRepository<Produccion, Long>{
}
