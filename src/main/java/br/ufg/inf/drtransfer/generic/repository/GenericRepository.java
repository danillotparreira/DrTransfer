package br.ufg.inf.drtransfer.generic.repository;

import br.ufg.inf.drtransfer.exception.DrTransferException;
import br.ufg.inf.drtransfer.generic.model.SuperClasse;
import java.util.List;
import java.util.Optional;

public interface GenericRepository<T extends SuperClasse> {

    public Optional<List<T>> findAll();

    public default Optional<T> find(Long codigo) {
        return findAll().isPresent() && !findAll().isEmpty() ? findAll().get().stream().filter(t -> t.getCodigo().equals(codigo)).findFirst() : Optional.empty();
//        if (findAll().isPresent() && !findAll().isEmpty()) {
//            for (T t : findAll().get()) {
//                if (t.getCodigo().equals(codigo)) {
//                    return Optional.of(t);
//                }
//            }
//        }
//        return Optional.empty();
    }

    public T update(T entity);

    /**
     * Método remove da lista com base na entidade passada
     *
     * @param entity a ser removida que tenha o codigo
     * @throws br.ufg.inf.drtransfer.exception.DrTransferException irá dar uma
     * exception caso não existir a entidade adicionada na lista
     */
    public void remove(T entity) throws DrTransferException;

    public default Long nextId() {
        Long codigo = 0l;
        for (T t : findAll().get()) {
            if (codigo < t.getCodigo()) {
                codigo = t.getCodigo();
            }
        }
        return codigo + 1l;
    }

}
