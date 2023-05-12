package controller;

import java.util.ArrayList;
import javax.swing.JTable;
import model.DAO.MaterialDAO;
import model.entities.MaterialItem;
import model.jdbc.ConnectionFactory;
import model.table.MaterialTableModel;

public class MateriaisController implements Controller {
    
    private ControllerUtil util = new ControllerUtil();
    
    @Override
    public void atualizaDescricao(Object... parametros) {
        JTable tabela = (JTable) parametros[1];
        MaterialTableModel model = (MaterialTableModel) tabela.getModel();
        
        MaterialItem material = model.getObjeto((int) parametros[0] - 1);
        GerenciadorDeTelas.getArqMaterial().jtpTextoDescricao.setText(" Teste ");
    }
    
    @Override
    public void carregarTudo(JTable tabela) throws Exception{
        MaterialDAO materialDAO = new MaterialDAO(new ConnectionFactory().getConexao());
        
        ArrayList<MaterialItem> materiaisCadastrados = (ArrayList) materialDAO.selectAll();
        MaterialTableModel modelo = new MaterialTableModel(materiaisCadastrados);
        
        //verifica se o modelo já foi carregado anteriormente e atualiza ou inicia
        if( tabela.getModel().getClass().isInstance( MaterialTableModel.class ) ){
            MaterialTableModel modeloAtual = (MaterialTableModel) tabela.getModel();
            modeloAtual.setMateriais( materiaisCadastrados );
        }else{    
            tabela.setModel( modelo );  
        }
        
    }   
    
    @Override
    public void inserir(String... campos) throws Exception {
        realizarValidacoesDosCampos(campos);

        MaterialItem material = new MaterialItem();
        
        material.setNome(campos[0]);
        material.setMultiplicadorDeCusto(util.converteParaDouble(campos[1]));
        material.setMultiplicadorDeDano(util.converteParaDouble(campos[2]));
        material.setModificadorDeDano(util.converteParaInt(campos[3]));
        material.setModificadorDeFn(util.converteParaInt(campos[4]));
        material.setMultiplicadorDePeso(util.converteParaDouble(campos[5]));
        
        new MaterialDAO( new ConnectionFactory().getConexao() ).add(material);     
    }
    
    @Override
    public void alterar(String... campos) throws Exception {
        realizarValidacoesDosCampos(campos);
        
        MaterialItem material = new MaterialItem();
        
        material.setId(util.converteParaInt(campos[0]));
        material.setNome(campos[1]);
        material.setMultiplicadorDeCusto(util.converteParaDouble(campos[2]));
        material.setMultiplicadorDeDano(util.converteParaDouble(campos[3]));
        material.setModificadorDeDano(util.converteParaInt(campos[4]));
        material.setModificadorDeFn(util.converteParaInt(campos[5]));
        material.setMultiplicadorDePeso(util.converteParaDouble(campos[6]));
        
        new MaterialDAO( new ConnectionFactory().getConexao() ).add(material); 
    }
    
    public void realizarValidacoesDosCampos(String... campos) throws Exception{
        util.validarCampoNaoVazio(campos[0]);
        util.validarDecimal(campos[1]);
        util.validarDecimal(campos[2]);
        util.validarInteiro(campos[3]);
        util.validarInteiro(campos[4]);
        util.validarDecimal(campos[5]);
    }
        
    @Override
    public void deletar() {
        
    }

    @Override
    public void filtrar(Object... parametros) throws Exception{
        String nome = (String) parametros[0];
        JTable tabela = (JTable) parametros[1];
        util.validarCampoNaoVazio(nome);

        MaterialDAO materialDAO =  new MaterialDAO( new ConnectionFactory().getConexao() );
        ArrayList<MaterialItem> materiaisEncontrados = (ArrayList) materialDAO.findByName(nome);     
        
        MaterialTableModel modelo = new MaterialTableModel(materiaisEncontrados);
        tabela.setModel( modelo );  
    }

}