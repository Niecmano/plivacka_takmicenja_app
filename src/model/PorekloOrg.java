/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nemanja
 */
public class PorekloOrg {
    
    private Organizator org;
    private Drzava drzava;
    private int godOsnivanja;

    public PorekloOrg(Organizator org, Drzava drzava, int godOsnivanja) {
        this.org = org;
        this.drzava = drzava;
        this.godOsnivanja = godOsnivanja;
    }

    public Organizator getOrg() {
        return org;
    }

    public void setOrg(Organizator org) {
        this.org = org;
    }

    public Drzava getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzava drzava) {
        this.drzava = drzava;
    }

    public int getGodOsnivanja() {
        return godOsnivanja;
    }

    public void setGodOsnivanja(int godOsnivanja) {
        this.godOsnivanja = godOsnivanja;
    }   
}
