/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Organizator;

/**
 *
 * @author Nemanja
 */
public class ModelTabeleOrg extends AbstractTableModel {
    private List<Organizator> orgs;
    private String[] kolone = {"id","organizator"};

    public ModelTabeleOrg(List<Organizator> orgs) {
        this.orgs = orgs;
    }

    @Override
    public int getRowCount() {
        return orgs.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Organizator org = orgs.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> org.getIdOrganizator();
            case 1 -> org.getNazivOrg();
            default -> null;
        };
    }
    
    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
}
