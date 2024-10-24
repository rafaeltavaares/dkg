package dkg.metric.demo.Services;

import dkg.metric.demo.DTOs.Search.SearchContentDTO;
import dkg.metric.demo.DTOs.Search.SearchDTO;
import dkg.metric.demo.Entities.Search;
import dkg.metric.demo.Entities.Users;
import dkg.metric.demo.Repositories.SearshRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SearchService {

    @Autowired
    private SearshRepository repository;

    @Autowired UserService userService;

    public void create(SearchContentDTO data) throws Exception{

       Optional<Users> user = userService.findById(data.user_id());
      Search search = new Search(data,user);
      this.save(search);
    }

    public Search save(Search entity) {
        this.repository.save(entity);
        return entity;
    }

    public List<Search> findAll(){
        return this.repository.findAll();
    }




}
