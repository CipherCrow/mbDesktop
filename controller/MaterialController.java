package controller;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.DAO.MaterialDAO;
import model.entities.Material;
import model.jdbc.ConnectionFactory;
import model.table.MaterialTableModel;

public class MaterialController implements Controller {
    
    private ControllerUtil util = new ControllerUtil();
    
    @Override
    public void atualizaDescricao(Object... parametros) {
        JTable tabela = (JTable) parametros[1];
        MaterialTableModel model = (MaterialTableModel) tabela.getModel();
        
        Material material = model.getObjeto((int) parametros[0]);
        GerenciadorDeTelas.getArqMaterial().jtpTextoDescricao.setText( material.getDescricaoView() );
    }
    
    @Override
    public void carregarTudo(JTable tabela) throws Exception{
        MaterialDAO materialDAO = new MaterialDAO(new ConnectionFactory().getConexao());
        
        ArrayList<Material> materiaisCadastrados = (ArrayList) materialDAO.selectAll();
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

        Material material = new Material();
        
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
        realizarValidacoesDosCampos(campos[1],campos[2],campos[3],campos[4],campos[5],campos[6]);
        
        Material material = new Material();
        
        material.setId(util.converteParaInt(campos[0]));
        material.setNome(campos[1]);
        material.setMultiplicadorDeCusto(util.converteParaDouble(campos[2]));
        material.setMultiplicadorDeDano(util.converteParaDouble(campos[3]));
        material.setModificadorDeDano(util.converteParaInt(campos[4]));
        material.setModificadorDeFn(util.converteParaInt(campos[5]));
        material.setMultiplicadorDePeso(util.converteParaDouble(campos[6]));
        
        new MaterialDAO( new ConnectionFactory().getConexao() ).update( material ); 
    }
    
    @Override
    public void realizarValidacoesDosCampos(String... campos) throws Exception{
        util.validarCampoNaoVazio(campos[0]);
        util.validarDecimal(campos[1]);
        util.validarDecimal(campos[2]);
        util.validarInteiro(campos[3]);
        util.validarInteiro(campos[4]);
        util.validarDecimal(campos[5]);
    }
        
    @Override
    public void deletar(String iD) throws Exception {
        int iDeletar = Integer.valueOf(iD);
        MaterialDAO materialDAO = new MaterialDAO( new ConnectionFactory().getConexao() );
        materialDAO.deleteByID( iDeletar );
    }

    @Override
    public void filtrar(Object... parametros) throws Exception{
        String nome = (String) parametros[0];
        JTable tabela = (JTable) parametros[1];
        util.validarCampoNaoVazio(nome);

        MaterialDAO materialDAO =  new MaterialDAO( new ConnectionFactory().getConexao() );
        ArrayList<Material> materiaisEncontrados = (ArrayList) materialDAO.findByName(nome);     
        
        MaterialTableModel modelo = new MaterialTableModel(materiaisEncontrados);
        tabela.setModel( modelo );  
    }

    @Override
    public void carregarParaEdicao(Object... parametro) throws Exception {
        MaterialDAO materialDAO =  new MaterialDAO( new ConnectionFactory().getConexao() );
        Material materialParaEdicao = (Material) materialDAO.findByID( (Integer) parametro[0] );
        
        ArrayList<JTextField> camposParaEdicao = (ArrayList<JTextField>) parametro[1];
        
        camposParaEdicao.get(0).setText( util.castParaString( materialParaEdicao.getId() ));
        camposParaEdicao.get(1).setText( util.castParaString( materialParaEdicao.getNome() ));
        camposParaEdicao.get(2).setText( util.castParaString( materialParaEdicao.getMultiplicadorDeCusto() ));
        camposParaEdicao.get(3).setText( util.castParaString( materialParaEdicao.getMultiplicadorDeDano() ));
        camposParaEdicao.get(4).setText( util.castParaString( materialParaEdicao.getModificadorDeDano() ));
        camposParaEdicao.get(5).setText( util.castParaString( materialParaEdicao.getModificadorDeFn() ));
        camposParaEdicao.get(6).setText( util.castParaString( materialParaEdicao.getMultiplicadorDePeso() ));
        
//        jtfId.setText( Integer.toString( materialParaEdicao.getId() ));
//        jtfNome.setText( materialParaEdicao.getNome() );
//        jtfCusto.setText( Double.toString( materialParaEdicao.getMultiplicadorDeCusto() ) );
//        jtfDanoMultiplicavel.setText( Double.toString( materialParaEdicao.getMultiplicadorDeDano() ) );
//        jtfDanoAdicional.setText( Integer.toString( materialParaEdicao.getModificadorDeDano() ) );
//        jtfFn.setText( Integer.toString( materialParaEdicao.getModificadorDeFn() ) );
//        jtfPesoMultiplicador.setText( Double.toString( materialParaEdicao.getMultiplicadorDePeso() ) );       
    }

}