package br.ufg.inf.drtransfer.model.enums;

public enum Sexo {

    MASCULINO ("Masculino"),
    FEMININO ("Feminino");

    private final  String texto;

    private Sexo (String texto)
    {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public Sexo getSexo(String texto) {
        for(Sexo x : Sexo.values()) {
            if(x.getTexto().equals(texto)) {
                return x;
            }
        }
        return null;
    }
}
