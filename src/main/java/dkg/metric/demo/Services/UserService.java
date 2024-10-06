package dkg.metric.demo.Services;

import dkg.metric.demo.DTOs.SearchDTO;
import dkg.metric.demo.Entities.Users;
import dkg.metric.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.Optional;

@Service
public class UserService implements BaseService<Optional<Users>> {

    @Autowired
    private UserRepository repository;



    @Override
    public Optional<Users> save(Optional<Users> entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Users> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Page<Optional<Users>> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public void update(Long id, Optional<Users> entity) {

    }

    @Override
    public void update(Long id, SearchDTO entity) {

    }

    @Override
    public void delete(Long id) {

    }
}
