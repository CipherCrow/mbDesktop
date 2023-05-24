package model.table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.entities.Idioma;

public class IdiomaTableModel extends AbstractTableModel {

    private ArrayList<Idioma> idiomas;
    private String[] colunas = TableEnum.Idioma.getCamposTabela();
    public IdiomaTableModel(ArrayList<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

    public void setMateriais(ArrayList<Idioma> idiomas) {
        this.idiomas = idiomas;
        fireTableDataChanged(); // Notifica a tabela que houve mudanças nos dados
    }

    @Override
    public int getRowCount() {
        return idiomas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Idioma idioma = idiomas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return idioma.getNome();
            case 1:
                return idioma.getIdiomaDeReferencia();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public Idioma getObjeto(int rowIndex){
        return idiomas.get(rowIndex);
    }
}