package com.example.mymovie.Classes;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Film {
    @ApiModelProperty(notes = "title of the film",name="titre",required=true,value="test titre")
    private String titre;
    @ApiModelProperty(notes = "nom du real",name="realisateur",required=true,value="test realisateur")
    private String realisateur;
    @ApiModelProperty(notes = "date de sortie du film",name="dateSortie",required=true,value="test dateSortie")
    private String dateSortie;

    public Film(String titre, String realisateur, String dateSortie){
        super();
        this.titre = titre;
        this.realisateur = realisateur;
        this.dateSortie = dateSortie;
    }

    //les getters
    public String getTitre(){
        return titre;
    }
    public String getRealisateur() {
        return realisateur;
    }
    public String getDateSortie() {
        return dateSortie;
    }

    //les setters
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }
    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }
}