package fr.sorbonne.paris.nord.university.api.controller;


public class TeamDto {

    private long ID;
    private String nom;
    private String slogan;

    public TeamDto() {
    }

    public TeamDto(String nom, String slogan) {
        this.nom = nom;
        this.slogan = slogan;
    }

    public TeamDto(long ID, String nom, String slogan) {
        this.ID = ID;
        this.nom = nom;
        this.slogan = slogan;
    }



    public long getID() {
        return ID;
    }

    public String getame() {
        return nom;
    }

    public String getSlogan() {
        return slogan;
    }

    public voID setID(long ID) {
        this.ID = ID;
    }

    public voID setnom(String nom) {
        this.nom = nom;
    }

    public voID setSlogan(String slogan) {
        this.slogan = slogan;
    }
}
