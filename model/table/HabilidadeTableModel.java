package model.table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.entities.Habilidade;

public class HabilidadeTableModel extends AbstractTableModel {

    private ArrayList<Habilidade> habilidades;
    private String[] colunas = TableEnum.Habilidade.getCamposTabela();
    public HabilidadeTableModel(ArrayList<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public void setHabilidades(ArrayList<Habilidade> habilidades) {
        this.habilidades = habilidades;
        fireTableDataChanged(); // Notifica a tabela que houve mudanças nos dados
    }

    @Override
    public int getRowCount() {
        return habilidades.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Habilidade habilidade = habilidades.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return habilidade.getNome();
            case 1:
                return habilidade.getCategoria();
            case 2:
                return habilidade.getTipo();
            case 3:
                return habilidade.getMana();
            case 4:
                return habilidade.getDificuldade();
            case 5:
                return habilidade.getResumo();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public Habilidade getObjeto(int rowIndex){
        return habilidades.get(rowIndex);
    }
}