package com.gaes4.AStyles.Controladores;

import com.gaes4.AStyles.Dtos.CategoriaGeneroDto;
import com.gaes4.AStyles.Dtos.CategoriaPrendaDto;
import com.gaes4.AStyles.Dtos.CategoriaTallasDto;
import com.gaes4.AStyles.Dtos.CateogoriaColorDto;
import com.gaes4.AStyles.Entidades.CategoriaColor;
import com.gaes4.AStyles.Entidades.CategoriaGenero;
import com.gaes4.AStyles.Entidades.CategoriaPrenda;
import com.gaes4.AStyles.Entidades.CategoriaTallas;
import com.gaes4.AStyles.Repositorios.CategoriaColorRepo;
import com.gaes4.AStyles.Repositorios.CategoriaPrendasRepo;
import com.gaes4.AStyles.Repositorios.CategoriaTallaRepo;
import com.gaes4.AStyles.Repositorios.CategoriasGeneroRepo;
import com.gaes4.AStyles.Servicios.CategoriaColorService;
import com.gaes4.AStyles.Servicios.CategoriaGeneroService;
import com.gaes4.AStyles.Servicios.CategoriaPrendaService;
import com.gaes4.AStyles.Servicios.CategoriaTallaService;
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
    private CategoriaPrendaService servicioCategoriaPrendas;
    @Autowired
    private CategoriaTallaService servicioCetegoriaTallas;
    @Autowired
    private CategoriaColorService servicioCategoriaColor;
    @Autowired
    private CategoriasGeneroRepo repositorioGeneroC;
    @Autowired
    private CategoriaPrendasRepo repositorioPrendasC;
    @Autowired
    private CategoriaTallaRepo repositoriotallasC;
    @Autowired
    private CategoriaColorRepo repositorioColorC;

    // listar categorias para GENEROS
    @GetMapping("/generos")
    public String mostrarGeneros(Model model) {
        List<CategoriaGeneroDto> categoriaGeneros =servicioCategoriaGenero.listaGeneroC();
        model.addAttribute("cgenero", categoriaGeneros);
        model.addAttribute("Cgenero", new CategoriaGeneroDto());
        return "Categorias/listaGeneros";
    }

    // Listar categorias para PRENDAS
    @GetMapping("/ropas")
    public String mostrarRopas(Model model) {
        List<CategoriaPrendaDto> categoriaPrendas = servicioCategoriaPrendas.listaprendasC();
        model.addAttribute("cprenda", categoriaPrendas);
        model.addAttribute("Cprenda", new CategoriaPrendaDto());
        return "Categorias/listaPrendas";
    }

    // Lista de TALLAS
    @GetMapping("/tallas")
    public String mostrarTallas(Model model) {
        List<CategoriaTallasDto> categoriaTalla = servicioCetegoriaTallas.listaCategoriasT();
        model.addAttribute("ctalla", categoriaTalla);
        model.addAttribute("Ctalla", new CategoriaTallasDto());
        return "Categorias/listaTallas";
    }
    // lista de colores
    @GetMapping("/colores")
    public String mostrarColores(Model model) {
        List<CateogoriaColorDto> cateogoriaColor = servicioCategoriaColor.listaCategorias();
        model.addAttribute("ccolor", cateogoriaColor);
        model.addAttribute("Ccolor", new CateogoriaColorDto());
        return "Categorias/listaColores";
    }

    // Crear PRENDAS
    @PostMapping("/ropas")
    public String crearCategoriaP(@ModelAttribute CategoriaPrendaDto categoriaPrendaDto, Model model) {
        try {
            Optional<CategoriaPrenda> existente = repositorioPrendasC.findByNombrePrenda(categoriaPrendaDto.getNombrePrenda());
            if (existente.isPresent()) {
                throw new IllegalArgumentException("La categoria" + categoriaPrendaDto.getNombrePrenda() + "' ya existe.");
            }
            servicioCategoriaPrendas.guardarGenero(categoriaPrendaDto);
            return "redirect:/categorias/ropas";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "Categorias/listaGeneros";
        }
    }

    // crear GENEROS
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
            return "Categorias/listaPrendas";
        }
    }

    @PostMapping("/tallas")
    public String crearCategoriaT(@ModelAttribute CategoriaTallasDto categoriaTallasDto, Model model) {
        try {
            Optional<CategoriaTallas> existente = repositoriotallasC.findByTalla(categoriaTallasDto.getTalla());
            if (existente.isPresent()) {
                throw new IllegalArgumentException("la Talla" + categoriaTallasDto.getTalla() + "ya esiste");
            }
            servicioCetegoriaTallas.GuardarCategoria(categoriaTallasDto);
            return "redirect:/categorias/tallas";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "Categorias/listaTallas";
        }
    }

    @PostMapping("/colores")
    public String crearCategoriaC(@ModelAttribute CateogoriaColorDto cateogoriaColorDto, Model model) {
        try {
            Optional<CategoriaColor> existente = repositorioColorC.findByColor(cateogoriaColorDto.getColor());
            if (existente.isPresent()) {
                throw new IllegalArgumentException("el color" + cateogoriaColorDto.getColor() + "ya exite en esta categoria");
            }
            servicioCategoriaColor.guardarColor(cateogoriaColorDto);
            return "redirect:/categorias/colores";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "Categorias/listaColores";
        }
    }
}
