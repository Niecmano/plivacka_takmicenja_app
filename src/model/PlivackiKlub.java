/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nemanja
 */
public class PlivackiKlub {
    
    private Long idKluba;
    private String nazivKluba;
    private int brojPlivaca;
    private int brojTrenera;
    private int ukupnoClanova;
    private Mesto mesto;

    public PlivackiKlub(Long idKluba, String nazivKluba, int brojPlivaca, int brojTrenera, Mesto mesto) {
        this.idKluba = idKluba;
        this.nazivKluba = nazivKluba;
        this.brojPlivaca = brojPlivaca;
        this.brojTrenera = brojTrenera;
        this.ukupnoClanova = brojPlivaca + brojTrenera;
        this.mesto = mesto;
    }

    public Long getIdKluba() {
        return idKluba;
    }

    public void setIdKluba(Long idKluba) {
        this.idKluba = idKluba;
    }

    public String getNazivKluba() {
        return nazivKluba;
    }

    public void setNazivKluba(String nazivKluba) {
        this.nazivKluba = nazivKluba;
    }

    public int getBrojPlivaca() {
        return brojPlivaca;
    }

    public void setBrojPlivaca(int brojPlivaca) {
        this.brojPlivaca = brojPlivaca;
    }

    public int getBrojTrenera() {
        return brojTrenera;
    }

    public void setBrojTrenera(int brojTrenera) {
        this.brojTrenera = brojTrenera;
    }

    public int getUkupnoClanova() {
        return ukupnoClanova;
    }

    public void setUkupnoClanova(int ukupnoClanova) {
        this.ukupnoClanova = ukupnoClanova;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    @Override
    public String toString() {
        return nazivKluba+" "+mesto;
    }
    
    @Override   
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof PlivackiKlub)) return false;
        PlivackiKlub pk = (PlivackiKlub) obj;
        return pk.getIdKluba().equals(idKluba);
    }
}
