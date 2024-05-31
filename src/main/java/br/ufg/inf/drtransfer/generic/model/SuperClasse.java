package br.ufg.inf.drtransfer.generic.model;

import java.time.LocalDateTime;

public abstract class SuperClasse {

    private Long codigo;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;
    private boolean ativo = true;

    public SuperClasse() {
        this.dataAtualizacao = LocalDateTime.now();
        this.dataCadastro = LocalDateTime.now();
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void updateDataAtualizacao() {
        this.dataAtualizacao = LocalDateTime.now();
    }

}
