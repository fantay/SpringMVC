/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Laurent-LIM
 */

@Controller
public class GenreController {
    
    
    @RequestMapping(value = "/liste_genre", method = RequestMethod.GET)
    public String lister(){
        
        return "genre_lister.jsp";
    }
}
