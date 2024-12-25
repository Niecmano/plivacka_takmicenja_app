/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nemanja
 */
public class StavkaEvidencijePrijave {
    
    private EvidencijaPrijave evidencija;
    private Long redniBrojStavke;
    private String disciplina;
    private Takmicar takmicar;

    public StavkaEvidencijePrijave(EvidencijaPrijave evidencija, Long redniBrojStavke, String disciplina, Takmicar takmicar) {
        this.evidencija = evidencija;
        this.redniBrojStavke = redniBrojStavke;
        this.disciplina = disciplina;
        this.takmicar = takmicar;
    }

    public EvidencijaPrijave getEvidencija() {
        return evidencija;
    }

    public void setEvidencija(EvidencijaPrijave evidencija) {
        this.evidencija = evidencija;
    }

    public Long getRedniBrojStavke() {
        return redniBrojStavke;
    }

    public void setRedniBrojStavke(Long redniBrojStavke) {
        this.redniBrojStavke = redniBrojStavke;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Takmicar getTakmicar() {
        return takmicar;
    }

    public void setTakmicar(Takmicar takmicar) {
        this.takmicar = takmicar;
    }
}
