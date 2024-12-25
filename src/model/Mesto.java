/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nemanja
 */
public class Mesto {
    
    private Long idMesto;
    private String nazivMesto;
    
    public Mesto(Long idMesto, String nazivMesto) {
        this.idMesto = idMesto;
        this.nazivMesto = nazivMesto;
    }

    public Long getIdMesto() {
        return idMesto;
    }

    public void setIdMesto(Long idMesto) {
        this.idMesto = idMesto;
    }

    public String getNazivMesto() {
        return nazivMesto;
    }

    public void setNazivMesto(String nazivMesto) {
        this.nazivMesto = nazivMesto;
    }

    @Override
    public String toString() {
        return this.nazivMesto;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Mesto)) return false;
        Mesto m = (Mesto) obj;
        return m.getIdMesto().equals(getIdMesto());
    }
}
