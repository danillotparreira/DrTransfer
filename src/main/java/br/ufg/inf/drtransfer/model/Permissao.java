package br.ufg.inf.drtransfer.model;

import br.ufg.inf.drtransfer.generic.model.SuperClasse;
import br.ufg.inf.drtransfer.model.enums.Rota;
import java.util.Objects;

public class Permissao extends SuperClasse {

    private Rota rota;
    private boolean criar;
    private boolean visualizar;
    private boolean editar;

    private GrupoPermissao grupoPermissao;

    public Permissao() {
    }

    public Permissao(GrupoPermissao grupoPermissao) {
        this.grupoPermissao = grupoPermissao;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    public boolean isCriar() {
        return criar;
    }

    public void setCriar(boolean criar) {
        this.criar = criar;
    }

    public boolean isVisualizar() {
        return visualizar;
    }

    public void setVisualizar(boolean visualizar) {
        this.visualizar = visualizar;
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public GrupoPermissao getGrupoPermissao() {
        return grupoPermissao;
    }

    public void setGrupoPermissao(GrupoPermissao grupoPermissao) {
        this.grupoPermissao = grupoPermissao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.rota);
        hash = 59 * hash + (this.criar ? 1 : 0);
        hash = 59 * hash + (this.visualizar ? 1 : 0);
        hash = 59 * hash + (this.editar ? 1 : 0);
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
        final Permissao other = (Permissao) obj;
        if (this.criar != other.criar) {
            return false;
        }
        if (this.visualizar != other.visualizar) {
            return false;
        }
        if (this.editar != other.editar) {
            return false;
        }
        return Objects.equals(this.rota, other.rota);
    }

}
