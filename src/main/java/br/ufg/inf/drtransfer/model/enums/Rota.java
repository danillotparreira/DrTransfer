package br.ufg.inf.drtransfer.model.enums;

import static br.ufg.inf.drtransfer.model.enums.Modulo.*;

public enum Rota {
    USUARIO("Usuário", ADMINISTRATIVO),
    PERMISSAO("Permissao", ADMINISTRATIVO),
    GRUPO_PERMISSAO("Grupo de Permissões", ADMINISTRATIVO);

    private final String descricao;
    private final Modulo modulo;
    private final boolean acoes;

    private Rota(String descricao, Modulo modulo) {
        this.descricao = descricao;
        this.modulo = modulo;
        this.acoes = true;
    }

    private Rota(String descricao, Modulo modulo, boolean acoes) {
        this.descricao = descricao;
        this.modulo = modulo;
        this.acoes = acoes;
    }

    public String getDescricao() {
        return descricao;
    }

    public Modulo getModulo() {
        return modulo;
    }

}
