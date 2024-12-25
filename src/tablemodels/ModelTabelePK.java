/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.PlivackiKlub;

/**
 *
 * @author Nemanja
 */
public class ModelTabelePK extends AbstractTableModel{
    private List<PlivackiKlub> klubovi;
    private String[] kolone = {"id","naziv","mesto","broj plivaca","broj trenera","ukupno clanova"};

    public ModelTabelePK(List<PlivackiKlub> klubovi) {
        this.klubovi = klubovi;
    }

    @Override
    public int getRowCount() {
        return klubovi.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PlivackiKlub pk = klubovi.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> pk.getIdKluba();
            case 1 -> pk.getNazivKluba();
            case 2 -> pk.getMesto();
            case 3 -> pk.getBrojPlivaca();
            case 4 -> pk.getBrojTrenera();
            case 5 -> pk.getUkupnoClanova();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
}