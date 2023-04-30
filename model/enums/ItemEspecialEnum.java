package model.enums;

public enum ItemEspecialEnum {
    Arremesso(
            "Arremesso",
            "Esta arma pode ser arremessada como se tivesse Alcance Curto(veja a tabela de armas de distância)."),
    Canalizador(
            "Canalizador",
            "Você pode realizar magias enquanto estiver empunhando esse item."),
    DuasMaos(
            "Duas Mãos",
            "São necessárias ambas as mãos para usar a arma."),
    Asseste(
            "Asseste Mágico",
            "Habilidades do tipo Magia tem sua dificuldade reduzida em 1."),
    CerneA(
            "Cerne Arcano",
            "Habilidades do tipo Magia que causem dano ou perda de Pontos de Vida causam +5 de dano ou a perda de 5 Pontos de vida a mais."),
    CerneM(
            "Cerne Místico",
            "Habilidades do tipo Magia que recuperem Pontos de Vida recuperam 5 Pontos de vida a mais."),
    Registro(
            "Registro",
            "Você pode registrar magias nesse item e usá-las para realizar rituais."),
    FocoM(
            "Foco Mágico",
            "Habilidades do tipo Magia conjuradas custam 5 Pontos de Mana a menos."),
    Carregar(
            "Carregar",
            "Esta arma usa um sistema de alavancas para ser recarregada. É preciso gastar uma Ação de Movimentação para recarregar esta arma."),
    Pesada(
            "Pesada",
            "Todos os danos são reduzidos em 1, modificador de corrida diminuído para o triplo de seu Deslocamento (ao invés do quádruplo)."),
    Rigida(
            "Rígida",
            "Se montado, a FN é considerada -1. Reduz os danos sofridos em 2, modificador de corrida será apenas o dobro de seu Deslocamento (ao invés do quadruplo)."),
    OcupaMao(
            "Ocupa uma Mão",
            "Precisa usar esse item em uma de suas mãos.");
    
    private String nome,descricao;
    
    ItemEspecialEnum(String nome,String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }
    
    private String getNome(){
        return this.nome;
    }
    
    private String getDescricao(){
        return this.descricao;
    }
}
