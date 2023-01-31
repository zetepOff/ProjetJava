package com.example.mymovie.controller;

//import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mymovie.Classes.Film;
import com.example.mymovie.Classes.Acteur;

@RestController
public class MovieServiceController {
    private static final Map<Integer, Film> filmData = new HashMap<Integer, Film>() {
        /**
         *
         */
        private static final long serialVersionUID = -3970206781360313502L;

        {
            //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            put(111,new Film("Avatar","James Cameron", "12/10/2009"));
            put(222,new Film("Avengers Endgame","Joe Russo", "15/01/2019"));
        }

    };
    private static final Map<Integer, Acteur> acteurData = new HashMap<Integer, Acteur>() {
        /**
         *
         */
        private static final long serialVersionUID = -3970206781360313502L;

        {
            //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            put(111,new Acteur("Weaver","Sigourney", "08/09/1949"));
            put(222,new Acteur("Hemsworth","Chris", "11/08/1983"));
        }

    };

    @RequestMapping(value = "/findFilmDetails/{filmTitre}", method = RequestMethod.GET)
    public Film getFilmDetails(@PathVariable String filmTitre){
        System.out.println("Getting Film details for " + filmTitre);
        Film film = filmData.get(filmTitre);
        if (film == null) {

            film = new Film("not found", "unknown", "unknown");

        }
        return film;
    }
    @RequestMapping(value = "/findActeurDetails/{acteurNom}", method = RequestMethod.GET)
    public Acteur getActeurDetails(@PathVariable String acteurNom){
        System.out.println("Getting Acteur details for " + acteurNom);
        Acteur acteur = acteurData.get(acteurNom);
        if (acteur == null) {

            acteur = new Acteur("not found", "unknown", "unknown");

        }
        return acteur;
    }
}