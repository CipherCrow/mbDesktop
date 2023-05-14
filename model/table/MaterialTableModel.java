package model.table;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.entities.Material;

public class MaterialTableModel extends AbstractTableModel {

    private ArrayList<Material> materiais;
    private String[] colunas = TableEnum.Material.getCamposTabela();
    public MaterialTableModel(ArrayList<Material> materiais) {
        this.materiais = materiais;
    }

    public void setMateriais(ArrayList<Material> materiais) {
        this.materiais = materiais;
        fireTableDataChanged(); // Notifica a tabela que houve mudanças nos dados
    }

    @Override
    public int getRowCount() {
        return materiais.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Material material = materiais.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return material.getNome();
            case 1:
                return material.getMultiplicadorDeCusto();
            case 2:
                return material.getMultiplicadorDeDano();
            case 3:
                return material.getModificadorDeDano();
            case 4:
                return material.getModificadorDeFn();
            case 5:
                return material.getMultiplicadorDePeso();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public Material getObjeto(int rowIndex){
        return materiais.get(rowIndex);
    }
}