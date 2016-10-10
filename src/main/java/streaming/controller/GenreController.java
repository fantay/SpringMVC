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
import streaming.entity.Genre;
import streaming.service.GenreCrudService;

/**
 *
 * @author Laurent-LIM
 */
@Controller
public class GenreController {

    @Autowired
    private GenreCrudService serviceGenre;
    
    @RequestMapping(method = RequestMethod.POST, value = "/modifier_genre")
    public String modifierPost(@ModelAttribute("genreAct") Genre genre){
        serviceGenre.save(genre);
        return "redirect:/liste_genre";
    }

    @RequestMapping(value = "/modifier_genre/{val}", method = RequestMethod.GET)
    public String modifierGet(@PathVariable("val") long idGenreAModifier, Model m) {

        Genre g = serviceGenre.findOne(idGenreAModifier);
        m.addAttribute("genreAct", g);

        return "modifier_genre.jsp";
    }

    @RequestMapping(value = "/supprimer_genre/{val}", method = RequestMethod.GET)
    public String supprimer(@PathVariable("val") long idGenreASupprimer) {

        serviceGenre.delete(idGenreASupprimer);
        
        return "redirect:/liste_genre";
    }

    @RequestMapping(value = {"/liste_genre","/"}, method = RequestMethod.GET)
    public String lister(Model m) {

        List<Genre> l = (List<Genre>) serviceGenre.findAllByOrderByNomAsc();

        m.addAttribute("listegenre", l);
        m.addAttribute("index", "home");

        return "genre_lister.jsp";
    }
}
