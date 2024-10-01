package dkg.metric.demo.Services;

import dkg.metric.demo.DTOs.SearchContentDTO;
import dkg.metric.demo.DTOs.SearchDTO;
import dkg.metric.demo.Entities.Search;
import dkg.metric.demo.Repositories.SearshRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SearchService implements BaseService<Search>{

    @Autowired
    private SearshRepository repository;


    public void create(SearchContentDTO data) throws Exception{
      Search search = new Search(data);
      this.save(search);
    }

    @Override
    public Search create(Search entity) {
        return null;
    }

    @Override
    public Search save(Search entity) {
        this.repository.save(entity);
        return entity;
    }

    @Override
    public Search findById(Long id) {
        return null;
    }

    @Override
    public Page<Search> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public void update(Long id, Search entity) {

    }

    @Override
    public void update(Long id, SearchDTO entity) {

    }


    @Override
    public void delete(Long id) {

    }


}
