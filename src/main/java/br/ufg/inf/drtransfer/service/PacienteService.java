package br.ufg.inf.drtransfer.service;

import br.ufg.inf.drtransfer.model.Paciente;
import br.ufg.inf.drtransfer.repository.PacienteRepository;
import br.ufg.inf.drtransfer.repository.PacienteRepositoryImpl;

import java.util.List;


//Aqui tratam-se os dados, aplicam-se as regras de negócio.

public class PacienteService
{
    private final PacienteRepository pacienteRepository;

    public PacienteService(){
        this.pacienteRepository = new PacienteRepositoryImpl();
    }

    public List<Paciente> findAll(){

     return this.pacienteRepository.findAll();
    }


}
