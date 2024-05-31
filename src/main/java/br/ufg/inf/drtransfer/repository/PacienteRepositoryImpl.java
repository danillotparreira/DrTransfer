package br.ufg.inf.drtransfer.repository;

import br.ufg.inf.drtransfer.exception.DrTransferException;
import br.ufg.inf.drtransfer.model.Paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteRepositoryImpl implements PacienteRepository{

    private List<Paciente> listaPacientes;

    public PacienteRepositoryImpl() {
        this.listaPacientes = new ArrayList<>();
    }

    @Override
    public List<Paciente> findAll() //retorna todos os pacientes
    {
        return listaPacientes;
    }

    @Override
    public Paciente find(long codigo) {

        for(Paciente x: listaPacientes) {
            if(codigo == x.getCodigo())
                return x;
        }
        return null;

    }

    @Override
    public Paciente updateCreate(Paciente paciente) {
        if(paciente.getCodigo() == null)
        {
            paciente.setCodigo(nextId());
            listaPacientes.add(paciente);
        }
        else{
            paciente.updateDataAtualizacao();
        }
        return paciente;
    }

    @Override
    public void remove(Paciente paciente) throws DrTransferException {
        if(paciente.getCodigo()!= null && find(paciente.getCodigo())!=null)
        {
            listaPacientes.remove(paciente);

        }
        else {
            throw new DrTransferException("Falha ao remover paciente", "Paciente não possui código");
        }


    }

    @Override
    public Long nextId() {
        long codigoAtual = 0l;
        for(Paciente x: listaPacientes) {
            if(x.getCodigo() > codigoAtual)
            {
                codigoAtual = x.getCodigo();
            }
        }

        return codigoAtual+1;
    }
}
