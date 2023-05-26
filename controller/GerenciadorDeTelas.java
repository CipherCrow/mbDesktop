package controller;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import view.gui.HabilidadeArquivo;
import view.gui.IdiomaArquivo;
import view.gui.IdiomaCadastro;
import view.gui.MaterialArquivo;
import view.gui.MaterialCadastro;

public class GerenciadorDeTelas{
    
    //Vai Crescer infinitamente, precisarei lidar com isso de alguma forma esperta
    private static MaterialArquivo arqMaterial;
    private static Map<String, MaterialCadastro> mapaMaterialCadastro = new HashMap<>();
    
    private static IdiomaArquivo arqIdioma;
    private static Map<String, IdiomaCadastro> mapaIdiomaCadastro = new HashMap<>();
    
    private static HabilidadeArquivo arqHabilidade;
    private static Map<String, HabilidadeCadastro> mapaHabilidadeCadastro = new HashMap<>();
    
    public static MaterialArquivo getArqMaterial() {
        if(arqMaterial == null){
            arqMaterial = new MaterialArquivo();
        }
        return arqMaterial ;
    }
    
    public static MaterialCadastro getCadMaterial(String chave, String idParaAlteracao) throws Exception{
        return (MaterialCadastro) criaTelaSeJaNaoExistir(chave, idParaAlteracao, mapaMaterialCadastro, MaterialCadastro.class);
    }
    
    public static void removerCadMaterial(String... parametros) {
        String chave = parametros[0];
        mapaMaterialCadastro.remove( chave );
    }
    
    public static IdiomaArquivo getArqIdioma() {
        if(arqIdioma == null){
            arqIdioma = new IdiomaArquivo();
        }
        return arqIdioma;
    }
    
    public static IdiomaCadastro getCadIdioma(String chave, String idParaAlteracao) throws Exception{
        return (IdiomaCadastro) criaTelaSeJaNaoExistir(chave, idParaAlteracao, mapaIdiomaCadastro, IdiomaCadastro.class);
    }
    
    public static void removerCadIdioma(String... parametros) {
        String chave = parametros[0];
        mapaIdiomaCadastro.remove( chave );
    }
    
    public static HabilidadeArquivo getArqHabilidade() {
        if(arqHabilidade == null){
            arqHabilidade = new HabilidadeArquivo();
        }
        return arqHabilidade;
    }
    
    public static HabilidadeCadastro getCadHabilidade(String chave, String idParaAlteracao) throws Exception{
        return (HabilidadeCadastro) criaTelaSeJaNaoExistir(chave, idParaAlteracao, mapaHabilidadeCadastro, HabilidadeCadastro.class);
    }
    
    public static void removerCadHabilidade(String... parametros) {
        String chave = parametros[0];
        mapaHabilidadeCadastro.remove( chave );
    }
        
    //Verifica se já existe uma tela, caso contrário verifica se é uma tela de alteração ou Adicionar e cria ela
    public static Object criaTelaSeJaNaoExistir(String chave, String idParaAlteracao , Map mapa, Class tipoDoMapa) 
            throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        
        //Recebe os construtores do tipo declardo
        Constructor<?>[] construtores = tipoDoMapa.getDeclaredConstructors();
                    
        if (!mapa.containsKey(chave)) {
            Object novoCadastro = null;
            
            if( idParaAlteracao.equals("Novo") ){
                //Percorre todos os construtores
                for (Constructor<?> construtor : construtores) {
                    
                    // Verifica os parâmetros do construtor
                    Class<?>[] parametros = construtor.getParameterTypes();
                    
                    // Construtor das telas de cadastro sem nenhum parâmetro
                    if (parametros.length == 0) {
                        
                        //O mesmo  new MaterialCadastro());
                        novoCadastro = construtor.newInstance();
                    }
                }
            }else{
                //Percorre todos os construtores
                for (Constructor<?> construtor : construtores) {

                    // Verifique os parâmetros do construtor
                    Class<?>[] parametros = construtor.getParameterTypes();
                    
                    // Construtor das telas de cadastro que recebe parâmetro inteiro
                    if (parametros.length == 1 && parametros[0] == int.class) {
                        System.out.println(idParaAlteracao);  
                        // O mesmo que new MaterialCadastro( Integer.valueOf( idParaAlteracao ));
                        novoCadastro = construtor.newInstance( Integer.valueOf( idParaAlteracao ) );   
                    }
                }                             
            }
            
            mapa.put(chave, novoCadastro);
        }
        return mapa.get( chave );
    }
   
}