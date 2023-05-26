package controller;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.DAO.HabilidadeDAO;
import model.entities.Habilidade;
import model.jdbc.ConnectionFactory;
import model.table.HabilidadeTableModel;

public class HabilidadeController implements Controller {
    
    private ControllerUtil util = new ControllerUtil();
    
    @Override
    public void atualizaDescricao(Object... parametros) {
        JTable tabela = (JTable) parametros[1];
        HabilidadeTableModel model = (HabilidadeTableModel) tabela.getModel();
        
        Habilidade habilidade = model.getObjeto((int) parametros[0]);
        GerenciadorDeTelas.getArqHabilidade().jtpTextoDescricao.setText( habilidade.getDescricaoView() );
    }
    
    @Override
    public void carregarTudo(JTable tabela) throws Exception{
        HabilidadeDAO habilidadeDAO = new HabilidadeDAO(new ConnectionFactory().getConexao());
        
        ArrayList<Habilidade> materiaisCadastrados = (ArrayList) habilidadeDAO.selectAll();
        HabilidadeTableModel modelo = new HabilidadeTableModel(materiaisCadastrados);
        
        //verifica se o modelo já foi carregado anteriormente e atualiza ou inicia
        if( tabela.getModel().getClass().isInstance( HabilidadeTableModel.class ) ){
            HabilidadeTableModel modeloAtual = (HabilidadeTableModel) tabela.getModel();
            modeloAtual.setHabilidades(materiaisCadastrados );
        }else{    
            tabela.setModel( modelo );  
        }
        
    }   
    
    @Override
    public void inserir(String... campos) throws Exception {
        realizarValidacoesDosCampos(campos[0]);
        
        Habilidade habilidade = new Habilidade();
        habilidade.setNome(campos[0]);
        habilidade.setHabilidadeDeReferencia("null");
        
        if(campos.length > 1){
        habilidade.setHabilidadeDeReferencia(campos[1]);}
        
        new HabilidadeDAO( new ConnectionFactory().getConexao() ).add(habilidade);     
    }
    
    @Override
    public void alterar(String... campos) throws Exception {
        realizarValidacoesDosCampos(campos[1]);
        
        Habilidade habilidade = new Habilidade();
        
        habilidade.setId(util.converteParaInt(campos[0]));
        habilidade.setNome(campos[1]);
        habilidade.setHabilidadeDeReferencia(campos[2]);
        
        new HabilidadeDAO( new ConnectionFactory().getConexao() ).update( habilidade ); 
    }
    
    @Override
    public void realizarValidacoesDosCampos(String... campos) throws Exception{
        util.validarCampoNaoVazio(campos[0]);
    }
        
    @Override
    public void deletar(String iD) throws Exception {
        int iDeletar = Integer.valueOf(iD);
        HabilidadeDAO habilidadeDAO = new HabilidadeDAO( new ConnectionFactory().getConexao() );
        habilidadeDAO.deleteByID( iDeletar );
        JTable tabela = GerenciadorDeTelas.getArqHabilidade().jtTabela;
        
        carregarTudo( tabela );
    }

    @Override
    public void filtrar(Object... parametros) throws Exception{
        String nome = (String) parametros[0];
        JTable tabela = (JTable) parametros[1];
        util.validarCampoNaoVazio(nome);

        HabilidadeDAO habilidadeDAO =  new HabilidadeDAO( new ConnectionFactory().getConexao() );
        ArrayList<Habilidade> materiaisEncontrados = (ArrayList) habilidadeDAO.findByName(nome);     
        
        HabilidadeTableModel modelo = new HabilidadeTableModel(materiaisEncontrados);
        tabela.setModel( modelo );  
    }

    @Override
    public void carregarParaEdicao(Object... parametro) throws Exception {
        HabilidadeDAO habilidadeDAO =  new HabilidadeDAO( new ConnectionFactory().getConexao() );
        Habilidade habilidadeParaEdicao = (Habilidade) habilidadeDAO.findByID( (Integer) parametro[0] );
        
        ArrayList<JTextField> camposParaEdicao = (ArrayList<JTextField>) parametro[1];
        
        camposParaEdicao.get(0).setText( util.castParaString( habilidadeParaEdicao.getId() ));
        camposParaEdicao.get(1).setText( util.castParaString( habilidadeParaEdicao.getNome() ));
        camposParaEdicao.get(2).setText( util.castParaString( habilidadeParaEdicao.getHabilidadeDeReferencia() ));
           
    }
    @Override
    public int getIdDoSelecionado(Object... parametros) {
        JTable tabela = (JTable) parametros[0];
        int selecionado = tabela.getSelectedRow();
        HabilidadeTableModel model = (HabilidadeTableModel) tabela.getModel();
        Habilidade habilidade = model.getObjeto( selecionado );
        return habilidade.getId();
    }

}