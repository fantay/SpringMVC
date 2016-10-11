/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import streaming.entity.Film;
import streaming.service.FilmCrudService;
import streaming.service.GenreCrudService;

/**
 *
 * @author tom
 */
@Controller
//@RequestMapping("/film")
public class FilmController {
    
    @Autowired
    private FilmCrudService serviceFilm;
    
    @Autowired
    private GenreCrudService servicegenre;
    
    @RequestMapping(method = RequestMethod.POST, value = "/ajout_film")
    public String ajouterfilmPost(@ModelAttribute("newFilm") Film film){
        serviceFilm.save(film);
        return "redirect:/liste_film";
    }
    
    
    @RequestMapping(method = RequestMethod.GET, value = "/ajout_film")
    public String ajouterFilmGet(Model m){
        m.addAttribute("newFilm", new Film());
        m.addAttribute("genres", servicegenre.findAllByOrderByNomAsc());
        return "ajout_film.jsp";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "liste_film")
    public String lister(Model m){
        
        List<Film> f = (List<Film>) serviceFilm.findAllByOrderByTitreAsc();
        
        m.addAttribute("listefilm", f);
        m.addAttribute("index", "home");
        return "film_lister.jsp";
    }
    
    
    
    
    
    
    
    
    
//    @RequestMapping(value="find/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public Film findById( @PathVariable("id") long id){
//        
//        Film f = new Film(1L, "Karate Kid", "blabla", 1989L, null);
//        
//        return f;
//    }
}
