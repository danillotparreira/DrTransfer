package br.ufg.inf.drtransfer.model;

import br.ufg.inf.drtransfer.generic.model.SuperClasse;

public class Usuario extends SuperClasse {

    private String usuario;
    private String senha;

    private GrupoPermissao grupoPermissao;

    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario.toLowerCase().trim();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public GrupoPermissao getGrupoPermissao() {
        return grupoPermissao;
    }

    public void setGrupoPermissao(GrupoPermissao grupoPermissao) {
        this.grupoPermissao = grupoPermissao;
    }

}
