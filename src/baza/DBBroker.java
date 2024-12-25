/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import java.util.List;
import model.*;
import java.sql.*;
import java.util.LinkedList;

/**
 *
 * @author Nemanja
 */
public class DBBroker {

    private static Connection conn;

    public DBBroker() {
        conn = Konekcija.getInstance().getConn();
    }

    public List<PlivackiKlub> vratiKluboveIzBaze() {
        List<PlivackiKlub> klubovi = new LinkedList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT pk.*, nazivMesta FROM plivackiklub pk JOIN mesto m ON pk.idMesto = m.idMesto");
            while (rs.next()) {
                klubovi.add(new PlivackiKlub(rs.getLong("idPlivackiKlub"), rs.getString("nazivPK"),
                        rs.getInt("brojPlivaca"), rs.getInt("brojTrenera"), new Mesto(rs.getLong("idMesto"), rs.getString("nazivMesta"))));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return klubovi;
    }

    public List<Organizator> vratiOrganizatoreIzBaze() {
        List<Organizator> orgs = new LinkedList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM organizator");
            while (rs.next()) {
                orgs.add(new Organizator(rs.getLong("idOrganizator"), rs.getString("nazivOrganizatora")));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return orgs;
    }

    public void izbrisiKlubIzBaze(Long id) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM plivackiklub WHERE idPlivackiKlub=?");
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void izbrisiOrganizatoraIzBaze(Long id) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM organizator WHERE idOrganizator=?");
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void dodajOrgUBazu(String naziv) {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO organizator VALUES(0,?)");
            ps.setString(1, naziv);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void izmeniOrg(Long id, String naziv) {
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE organizator SET nazivOrganizatora=? WHERE idOrganizator=?");
            ps.setString(1, naziv);
            ps.setLong(2, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public List<Mesto> vratiMestaIzBaze() {
        List<Mesto> mesta = new LinkedList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM mesto");
            while (rs.next()) {
                mesta.add(new Mesto(rs.getLong("idMesto"), rs.getString("nazivMesta")));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return mesta;
    }

    public void dodajPKuBazu(PlivackiKlub pk) {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO plivackiklub VALUES(0,?,?,?,?,?)");
            ps.setString(1, pk.getNazivKluba());
            ps.setInt(2, pk.getBrojPlivaca());
            ps.setInt(3, pk.getBrojTrenera());
            ps.setInt(4, pk.getBrojPlivaca()+pk.getBrojTrenera());
            ps.setLong(5, pk.getMesto().getIdMesto());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void izmeniKlubUBazi(PlivackiKlub pk) {
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE plivackiklub SET nazivPK=?, "
                    + "brojPlivaca=?, brojTrenera=?, ukupnoClanova=?, idMesto=? WHERE idPlivackiKlub=?");
            ps.setString(1, pk.getNazivKluba());
            ps.setInt(2, pk.getBrojPlivaca());
            ps.setInt(3, pk.getBrojTrenera());
            ps.setInt(4, pk.getUkupnoClanova());
            ps.setLong(5, pk.getMesto().getIdMesto());
            ps.setLong(6, pk.getIdKluba());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public List<PlivackiKlub> filterKlubovaPoNazivu(String naziv, Mesto mesto) {
        List<PlivackiKlub> klubovi = new LinkedList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT pk.*, nazivMesta FROM plivackiklub pk JOIN mesto m "
                    + "ON pk.idMesto = m.idMesto WHERE LOWER(nazivPK) LIKE '%"+naziv.toLowerCase()+"%' "
                            + "AND m.idMesto="+mesto.getIdMesto());
            while (rs.next()) {
                klubovi.add(new PlivackiKlub(rs.getLong("idPlivackiKlub"), rs.getString("nazivPK"),
                        rs.getInt("brojPlivaca"), rs.getInt("brojTrenera"), new Mesto(rs.getLong("idMesto"), 
                                rs.getString("nazivMesta"))));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return klubovi;
    }

    public List<Takmicar> vratiTakmPK(PlivackiKlub pk) {
        List<Takmicar> takms = new LinkedList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM takmicar WHERE idPK=?");
            ps.setLong(1, pk.getIdKluba());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                takms.add(new Takmicar(rs.getLong("idTakmicar"), rs.getInt("uzrast"),
                        rs.getString("imePrezime"), Pol.valueOf(rs.getString("pol")), pk));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return takms;
    }

    public void izbrisiTakmUBazi(Long id) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM takmicar WHERE idTakmicar=?");
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void dodajTakmicara(Takmicar t) {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO takmicar VALUES(0,?,?,?,?)");
            ps.setInt(1, t.getUzrast());
            ps.setString(2, t.getImePrezime());
            ps.setString(3, String.valueOf(t.getPol()));
            ps.setLong(4, t.getPk().getIdKluba());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void izmeniTakm(Takmicar t) {
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE takmicar SET uzrast=?, "
                    + "imePrezime=?, idPK=? WHERE idTakmicar=?");
            ps.setInt(1, t.getUzrast());
            ps.setString(2, t.getImePrezime());
            ps.setLong(3, t.getPk().getIdKluba());
            ps.setLong(4, t.getIdTakmicar());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
