package br.ufg.inf.drtransfer.generic.repository;

import br.ufg.inf.drtransfer.generic.model.SuperClasse;
import java.util.List;
import java.util.Optional;

public interface GenericRepository<T extends SuperClasse> {

    public Optional<List<T>> findAll();

    public default Optional<T> find(Long codigo) {
        return findAll().isEmpty() ? findAll().get().stream().filter(t -> t.getCodigo().equals(codigo)).findFirst() : Optional.empty();
    }

    public default Optional<T> create(T entity){
        return null;
    }

    public void edit();

    public void remove();

}
