package com.gaes4.AStyles.ImplementosServicios;

import com.gaes4.AStyles.Dtos.ProductoDTO;

import java.util.List;

public interface ProductoImpl {
    List<ProductoDTO> findAll();

    ProductoDTO findById(Long id);

    ProductoDTO save(ProductoDTO productoDTO);

}
