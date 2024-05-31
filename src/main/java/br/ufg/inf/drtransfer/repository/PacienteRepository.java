package br.ufg.inf.drtransfer.repository;


import br.ufg.inf.drtransfer.exception.DrTransferException;
import br.ufg.inf.drtransfer.model.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteRepository {

    public List<Paciente> findAll();

    public Paciente find(long codigo);


    public Paciente updateCreate(Paciente paciente);

    /**
     * Método remove da lista com base na entidade passada
     *
     * @param entity a ser removida que tenha o codigo
     * @throws br.ufg.inf.drtransfer.exception.DrTransferException irá dar uma
     * exception caso não existir a entidade adicionada na lista
     */
    public void remove(Paciente paciente) throws DrTransferException;

    public Long nextId();
}
