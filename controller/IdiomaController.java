package controller;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.DAO.IdiomaDAO;
import model.entities.Idioma;
import model.jdbc.ConnectionFactory;
import model.table.IdiomaTableModel;

public class IdiomaController implements Controller {
    
    private ControllerUtil util = new ControllerUtil();
    
    @Override
    public void atualizaDescricao(Object... parametros) {
        JTable tabela = (JTable) parametros[1];
        IdiomaTableModel model = (IdiomaTableModel) tabela.getModel();
        
        Idioma idioma = model.getObjeto((int) parametros[0]);
        GerenciadorDeTelas.getArqIdioma().jtpTextoDescricao.setText( idioma.getDescricaoView() );
    }
    
    @Override
    public void carregarTudo(JTable tabela) throws Exception{
        IdiomaDAO idiomaDAO = new IdiomaDAO(new ConnectionFactory().getConexao());
        
        ArrayList<Idioma> materiaisCadastrados = (ArrayList) idiomaDAO.selectAll();
        IdiomaTableModel modelo = new IdiomaTableModel(materiaisCadastrados);
        
        //verifica se o modelo já foi carregado anteriormente e atualiza ou inicia
        if( tabela.getModel().getClass().isInstance( IdiomaTableModel.class ) ){
            IdiomaTableModel modeloAtual = (IdiomaTableModel) tabela.getModel();
            modeloAtual.setMateriais( materiaisCadastrados );
        }else{    
            tabela.setModel( modelo );  
        }
        
    }   
    
    @Override
    public void inserir(String... campos) throws Exception {
        realizarValidacoesDosCampos(campos[0]);
        
        Idioma idioma = new Idioma();
        idioma.setNome(campos[0]);
        idioma.setIdiomaDeReferencia("null");
        
        if(campos.length > 1){
        idioma.setIdiomaDeReferencia(campos[1]);}
        
        new IdiomaDAO( new ConnectionFactory().getConexao() ).add(idioma);     
    }
    
    @Override
    public void alterar(String... campos) throws Exception {
        realizarValidacoesDosCampos(campos[1]);
        
        Idioma idioma = new Idioma();
        
        idioma.setId(util.converteParaInt(campos[0]));
        idioma.setNome(campos[1]);
        idioma.setIdiomaDeReferencia(campos[2]);
        
        new IdiomaDAO( new ConnectionFactory().getConexao() ).update( idioma ); 
    }
    
    @Override
    public void realizarValidacoesDosCampos(String... campos) throws Exception{
        util.validarCampoNaoVazio(campos[0]);
    }
        
    @Override
    public void deletar(String iD) throws Exception {
        int iDeletar = Integer.valueOf(iD);
        IdiomaDAO idiomaDAO = new IdiomaDAO( new ConnectionFactory().getConexao() );
        idiomaDAO.deleteByID( iDeletar );
        JTable tabela = GerenciadorDeTelas.getArqIdioma().jtTabela;
        
        carregarTudo( tabela );
    }

    @Override
    public void filtrar(Object... parametros) throws Exception{
        String nome = (String) parametros[0];
        JTable tabela = (JTable) parametros[1];
        util.validarCampoNaoVazio(nome);

        IdiomaDAO idiomaDAO =  new IdiomaDAO( new ConnectionFactory().getConexao() );
        ArrayList<Idioma> materiaisEncontrados = (ArrayList) idiomaDAO.findByName(nome);     
        
        IdiomaTableModel modelo = new IdiomaTableModel(materiaisEncontrados);
        tabela.setModel( modelo );  
    }

    @Override
    public void carregarParaEdicao(Object... parametro) throws Exception {
        IdiomaDAO idiomaDAO =  new IdiomaDAO( new ConnectionFactory().getConexao() );
        Idioma idiomaParaEdicao = (Idioma) idiomaDAO.findByID( (Integer) parametro[0] );
        
        ArrayList<JTextField> camposParaEdicao = (ArrayList<JTextField>) parametro[1];
        
        camposParaEdicao.get(0).setText( util.castParaString( idiomaParaEdicao.getId() ));
        camposParaEdicao.get(1).setText( util.castParaString( idiomaParaEdicao.getNome() ));
        camposParaEdicao.get(1).setText( util.castParaString( idiomaParaEdicao.getIdiomaDeReferencia() ));
           
    }
    @Override
    public int getIdDoSelecionado(Object... parametros) {
        JTable tabela = (JTable) parametros[0];
        int selecionado = tabela.getSelectedRow();
        IdiomaTableModel model = (IdiomaTableModel) tabela.getModel();
        Idioma idioma = model.getObjeto( selecionado );
        return idioma.getId();
    }

}