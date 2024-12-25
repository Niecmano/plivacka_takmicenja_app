/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nemanja
 */
public class Drzava {
    
    private Long idDrzave;
    private String nazivDrzave;

    public Drzava(Long idDrzave, String nazivDrzave) {
        this.idDrzave = idDrzave;
        this.nazivDrzave = nazivDrzave;
    }

    public Long getIdDrzave() {
        return idDrzave;
    }

    public void setIdDrzave(Long idDrzave) {
        this.idDrzave = idDrzave;
    }

    public String getNazivDrzave() {
        return nazivDrzave;
    }

    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }
}
