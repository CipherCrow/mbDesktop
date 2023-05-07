package controller;

public interface Controller {
    public void inserir(String... campos) throws Exception;
    public void deletar();
    public void alterar(String... campos);
}
