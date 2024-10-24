package dkg.metric.demo.Services;

import dkg.metric.demo.DTOs.Search.SearchDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface BaseService<E> {
    //Interface Basica e comum de Servico

    void create (E entity);
    void save (E entity);
    E findById (Long id);
    Page<E> findAll (Pageable pageable);
    void update (Long id, E entity);

    void update(Long id, SearchDTO entity);

    void delete (Long id);
}
