package br.ufg.inf.drtransfer.model.enums;

public enum Rota {
    USUARIO("Usuário", ClassificacaoRota.ADMINISTRATIVO),
    PERMISSAO("Permissao", ClassificacaoRota.ADMINISTRATIVO),
    GRUPO_PERMISSAO("Grupo de Permissões", ClassificacaoRota.ADMINISTRATIVO);

    private final String descricao;
    private final ClassificacaoRota classificacao;

    private Rota(String descricao, ClassificacaoRota classificacao) {
        this.descricao = descricao;
        this.classificacao = classificacao;
    }

    public String getDescricao() {
        return descricao;
    }

}
