package controller;

import javax.swing.JTable;

public interface Controller {
    
    public void carregarTudo(JTable tabela) throws Exception;
    public void filtrar(Object... parametrosETabela) throws Exception;
    public void inserir(String... campos) throws Exception;
    public void deletar();
    public void alterar(String... campos) throws Exception;
}
