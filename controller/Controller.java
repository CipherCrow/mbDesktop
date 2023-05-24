package controller;

import javax.swing.JTable;

public interface Controller {
    
    public void carregarTudo(JTable tabela) throws Exception;
    public void carregarParaEdicao(Object... parametros) throws Exception;
    public void atualizaDescricao(Object... parametros) throws Exception;
    public void filtrar(Object... parametrosETabela) throws Exception;
    public void inserir(String... campos) throws Exception;
    public void deletar(String iD) throws Exception;
    public void alterar(String... campos) throws Exception;
    public void realizarValidacoesDosCampos(String... campos) throws Exception;
    public int getIdDoSelecionado(Object... parametros);
}
