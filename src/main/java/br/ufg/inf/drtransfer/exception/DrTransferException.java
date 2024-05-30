package br.ufg.inf.drtransfer.exception;

public class DrTransferException extends Exception {

    private String titulo;

    public DrTransferException(String mensagem) {
        super(mensagem);
    }

    public DrTransferException(String titulo, String mensagem) {
        super(mensagem);
        this.titulo = titulo;
    }
    
}
