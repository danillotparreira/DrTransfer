package br.ufg.inf.drtransfer.model;

import br.ufg.inf.drtransfer.generic.model.SuperClasse;
import java.util.List;
import java.util.Objects;

public class GrupoPermissao extends SuperClasse {

    private String descricao;
    private List<Permissao> permissoes;
    private List<Usuario> usuarios;

    public GrupoPermissao() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Permissao> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<Permissao> permissoes) {
        this.permissoes = permissoes;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GrupoPermissao other = (GrupoPermissao) obj;
        return Objects.equals(this.descricao, other.descricao);
    }

}
