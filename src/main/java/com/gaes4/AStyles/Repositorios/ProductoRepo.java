package com.gaes4.AStyles.Repositorios;

import com.gaes4.AStyles.Entidades.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepo extends JpaRepository<Productos, Long>{
}
