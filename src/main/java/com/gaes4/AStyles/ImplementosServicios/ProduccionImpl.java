package com.gaes4.AStyles.ImplementosServicios;

import com.gaes4.AStyles.Dtos.ProduccionDTO;

import java.util.List;

public interface ProduccionImpl {
    List<ProduccionDTO> findAll();

    ProduccionDTO findById(Long id);

    ProduccionDTO save(ProduccionDTO produccionDTO);

}
