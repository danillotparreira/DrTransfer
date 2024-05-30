package br.ufg.inf.drtransfer.generic.repository;

import br.ufg.inf.drtransfer.exception.DrTransferException;
import br.ufg.inf.drtransfer.generic.model.SuperClasse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenericRepositoryImpl<T extends SuperClasse> implements GenericRepository<T> {

    private List<T> lista;

    public GenericRepositoryImpl() {
        this.lista = new ArrayList<>();
    }

    @Override
    public Optional<List<T>> findAll() {
        return Optional.of(lista);
    }

    @Override
    public T update(T entity) {
        entity.setCodigo(nextId());
        lista.add(entity);
        return entity;
    }

    @Override
    public void remove(T entity) throws DrTransferException{
        if (find(entity.getCodigo()).isPresent()) {
            findAll().get().remove(entity);
        } else {
            throw new DrTransferException("Falha ao excluir", "Não foi possível remover a entidade pois ela não existe adicionada na lista.");
        }
    }

}
