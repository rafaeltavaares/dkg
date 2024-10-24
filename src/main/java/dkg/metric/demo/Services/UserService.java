package dkg.metric.demo.Services;

import dkg.metric.demo.DTOs.Search.SearchDTO;
import dkg.metric.demo.DTOs.User.UserDTO;
import dkg.metric.demo.Entities.Users;
import dkg.metric.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService{

    @Autowired
    private UserRepository repository;


    public Users create(UserDTO entity) {
        Users user = new Users(entity);
        this.save(user);
        return user;
    }

    public void save(Users entity) {
        this.repository.save(entity);
    }

    public Optional<Users> findById(Long id) {
        return repository.findById(id);
    }

}
