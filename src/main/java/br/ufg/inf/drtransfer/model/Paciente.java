package br.ufg.inf.drtransfer.model;

import br.ufg.inf.drtransfer.generic.model.SuperClasse;

public class Paciente extends SuperClasse {

    private String name;
    private String sexo;

    private String cpf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
