package com.gaes4.AStyles.Controladores;

import com.gaes4.AStyles.Dtos.CategoriaGeneroDto;
import com.gaes4.AStyles.Entidades.CategoriaGenero;
import com.gaes4.AStyles.Repositorios.CategoriasGeneroRepo;
import com.gaes4.AStyles.Servicios.CategoriaGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/categorias")
public class CategoriasGeneralesController {

    @Autowired
    private CategoriaGeneroService servicioCategoriaGenero;
    @Autowired
    private CategoriasGeneroRepo repositorioGeneroC;

    @GetMapping("/generos")
    public String mostrarGeneros(Model model) {
        List<CategoriaGeneroDto> categoriaGeneros =servicioCategoriaGenero.listaGeneroC();
        model.addAttribute("cgenero", categoriaGeneros);
        model.addAttribute("Cgenero", new CategoriaGeneroDto());
        return "Categorias/listaGeneros";
    }

    @PostMapping("/generos")
    public String crearCategoriaG(@ModelAttribute CategoriaGeneroDto categoriaGeneroDto, Model model) {
        try {
            Optional<CategoriaGenero> existente = repositorioGeneroC.findByGenero(categoriaGeneroDto.getGenero());
            if (existente.isPresent()) {
                throw new IllegalArgumentException("El género '" + categoriaGeneroDto.getGenero() + "' ya existe.");
            }
            servicioCategoriaGenero.guardarGenero(categoriaGeneroDto);
            return "redirect:/categorias/generos";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "Categorias/listaGeneros";
        }
    }
}
