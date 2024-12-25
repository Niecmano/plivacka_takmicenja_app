/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nemanja
 */
public class Organizator {
    
    private Long idOrganizator;
    private String nazivOrg;

    public Organizator(Long idOrganizator, String nazivOrg) {
        this.idOrganizator = idOrganizator;
        this.nazivOrg = nazivOrg;
    }

    public Long getIdOrganizator() {
        return idOrganizator;
    }

    public void setIdOrganizator(Long idOrganizator) {
        this.idOrganizator = idOrganizator;
    }

    public String getNazivOrg() {
        return nazivOrg;
    }

    public void setNazivOrg(String nazivOrg) {
        this.nazivOrg = nazivOrg;
    }   
}
