/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Nemanja
 */
public class EvidencijaPrijave {
    
    private Long idPrijave;
    private int brNastupa;
    private LocalDate datumEvid;
    private Organizator organizator;
    private PlivackiKlub klub;

    public EvidencijaPrijave(Long idPrijave, LocalDate datumEvid, Organizator organizator, PlivackiKlub klub) {
        this.idPrijave = idPrijave;
        this.datumEvid = datumEvid;
        this.organizator = organizator;
        this.klub = klub;
    }

    public Long getIdPrijave() {
        return idPrijave;
    }

    public void setIdPrijave(Long idPrijave) {
        this.idPrijave = idPrijave;
    }

    public int getBrNastupa() {
        return brNastupa;
    }

    public void setBrNastupa(int brNastupa) {
        this.brNastupa = brNastupa;
    }

    public LocalDate getDatumEvid() {
        return datumEvid;
    }

    public void setDatumEvid(LocalDate datumEvid) {
        this.datumEvid = datumEvid;
    }

    public Organizator getOrganizator() {
        return organizator;
    }

    public void setOrganizator(Organizator organizator) {
        this.organizator = organizator;
    }

    public PlivackiKlub getKlub() {
        return klub;
    }

    public void setKlub(PlivackiKlub klub) {
        this.klub = klub;
    }
}
