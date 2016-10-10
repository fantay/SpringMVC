/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Laurent-LIM
 */

@Controller
public class HomePageController {
    
    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String homePage(Model m){
     
        m.addAttribute("titre", "Bienvenue, cette page qui fonctionne grâce a un attribut.");
        
        m.addAttribute("lien_genre", "liste_genre");
             
        return "home_page.jsp";
    }
}
