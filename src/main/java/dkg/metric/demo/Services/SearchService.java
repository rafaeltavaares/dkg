package dkg.metric.demo.Services;

import dkg.metric.demo.DTOs.SearchContentDTO;
import dkg.metric.demo.DTOs.SearchDTO;
import dkg.metric.demo.Entities.Search;
import dkg.metric.demo.Entities.Users;
import dkg.metric.demo.Repositories.SearshRepository;
import dkg.metric.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.Optional;

@Service
public class SearchService implements BaseService<Search>{

    @Autowired
    private SearshRepository repository;

    @Autowired UserService userService;

    public void create(SearchContentDTO data) throws Exception{

       Optional<Users> user = userService.findById(data.user_id());
      Search search = new Search(data,user);
      this.save(search);
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
