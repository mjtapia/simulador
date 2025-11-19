package cl.uda.simulador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import cl.uda.simulador.model.Vacante;
import cl.uda.simulador.service.VacanteService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
public class HomeController {

    @Autowired
    private VacanteService vacanteService;

    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String home(Model model) {


        List<Object[]> carreras = vacanteService.obtenerCarrerasDistinct(); // ver abajo el service
        logger.info("carreras.size = {}", carreras == null ? "null" : carreras.size());
        logger.info("Carreras recibidas: {}", carreras.size());
    if (!carreras.isEmpty()) {
        logger.info("Primero → codigo: {}, nombre: {}", carreras.get(0)[0], carreras.get(0)[1]);
    }

    model.addAttribute("carreras", carreras);
    return "index";
    }
    
    
}
