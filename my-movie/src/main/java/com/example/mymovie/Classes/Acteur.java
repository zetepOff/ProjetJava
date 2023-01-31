package com.example.mymovie.Classes;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Acteur {
    @ApiModelProperty(notes = "nom de l'acteur",name="nom",required=true,value="test nom")
    private String nom;
    @ApiModelProperty(notes = "prénom de l'acteur",name="prenom",required=true,value="test prenom")
    private String prenom;
    @ApiModelProperty(notes = "date de naissance de l'acteur",name="dateNaissance",required=true,value="test dateNaissance")
    private String dateNaissance;
    private List<Film> filmographie;

    public Acteur (String nom, String prenom, String dateNaissance){
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    //les getters
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getDateNaissance() {
        return dateNaissance;
    }

    //les setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}