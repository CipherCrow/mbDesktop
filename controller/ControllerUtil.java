package controller;

import exceptions.CamposInvalidosException;

public class ControllerUtil {
    
    public void validarCampoNaoVazio(String campo) throws Exception {
        if (campo == null || campo.trim().isEmpty()) {
            throw new CamposInvalidosException("Não foi possível inserir o Material");
        }
    }
    //Verifica se é um campo de texto inteiro e não vazio
    public void validarInteiro(String campo) throws Exception {
                         //"^-?\\d+$";        
        if (!campo.matches("^-?\\d+$")) {
            throw new CamposInvalidosException("Não foi possível inserir o Material");
        }
    }
    
    //Verifica se um campo de texto não está vazio e se um número inserido não contém caracteres especiais (exceto o ponto decimal) e não é um número negativo.
    public void validarDecimal(String campo) throws Exception {          
                         //"^(?=\\S)([+-]?([0-9]*[.])?[0-9]+)?$";
        if (!campo.matches("^(?=\\S)([+-]?([0-9]*[.])?[0-9]+)?$")) {
            throw new CamposInvalidosException("Não foi possível inserir o Material");
        }
    }
    
    public Double converteParaDouble(String string){
        return Double.parseDouble(string);
    }
    
    public int converteParaInt(String string){
        return Integer.parseInt(string);
    }
    
    public String castParaString(Object objeto){
        if(String.class.isInstance( objeto )){
            return (String) objeto;
        } else if(Integer.class.isInstance(objeto)){
            return Integer.toString((Integer) objeto );
        } else if(Double.class.isInstance(objeto)){
            return Double.toString( (Double) objeto  );
        }
        return "";
    }
    
}
