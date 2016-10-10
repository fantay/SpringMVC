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
    
    @RequestMapping(value = "/supprimer_genre/{val}", method = RequestMethod.GET)
    public String supprimer( @PathVariable("val") long idGenreASupprimer){
        
        serviceGenre.delete(idGenreASupprimer);
        return "redirect:/liste_genre" ;
    }
    
    

    @RequestMapping(value = "/liste_genre", method = RequestMethod.GET)
    public String lister(Model m) {

        List<Genre> l = (List<Genre>) serviceGenre.findAllByOrderByNomAsc();

        m.addAttribute("listegenre", l);
        m.addAttribute("index", "home");

        return "genre_lister.jsp";
    }
}
