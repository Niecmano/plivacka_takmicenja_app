/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logika;

import baza.DBBroker;
import java.util.List;
import model.Mesto;
import model.Organizator;
import model.PlivackiKlub;

/**
 *
 * @author Nemanja
 */
public class Kontroler {
    private static Kontroler kontroler;
    private DBBroker dbb;
    private Kontroler(){
        dbb = new DBBroker();
    }
    public static Kontroler getInstance(){
        if(kontroler==null) kontroler = new Kontroler();
        return kontroler;
    }

    public List<PlivackiKlub> vratiKlubove() {
        return dbb.vratiKluboveIzBaze();
    }

    public List<Organizator> vratiOrgs() {
        return dbb.vratiOrganizatoreIzBaze();
    }

    public void izbrisiKlubIzBaze(Long id) {
        dbb.izbrisiKlubIzBaze(id);
    }

    public void izbrisiOrganizatoraIzBaze(Long id) {
        dbb.izbrisiOrganizatoraIzBaze(id);
    }

    public void dodajOrg(String naziv) {
        dbb.dodajOrgUBazu(naziv);
    }

    public void izmeniOrg(Long id, String naziv) {
        dbb.izmeniOrg(id,naziv);
    }

    public List<Mesto> vratiMesta() {
        return dbb.vratiMestaIzBaze();
    }

    public void dodajPK(PlivackiKlub p) {
        dbb.dodajPKuBazu(p);
    }

    public void izmeniKlub(PlivackiKlub p) {
        dbb.izmeniKlubUBazi(p);
    }

    public List<PlivackiKlub> filtrirajKlubovePoNazivu(String naziv, Mesto mesto) {
        return dbb.filterKlubovaPoNazivu(naziv,mesto);
    }
}
