/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nemanja
 */
public class Takmicar {
    
    private Long idTakmicar;
    private int uzrast;
    private String imePrezime;
    private Pol pol;

    public Takmicar(Long idTakmicar, int uzrast, String imePrezime, Pol pol) {
        this.idTakmicar = idTakmicar;
        this.uzrast = uzrast;
        this.imePrezime = imePrezime;
        this.pol = pol;
    }

    public Long getIdTakmicar() {
        return idTakmicar;
    }

    public void setIdTakmicar(Long idTakmicar) {
        this.idTakmicar = idTakmicar;
    }

    public int getUzrast() {
        return uzrast;
    }

    public void setUzrast(int uzrast) {
        this.uzrast = uzrast;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public Pol getPol() {
        return pol;
    }

    public void setPol(Pol pol) {
        this.pol = pol;
    }
}
