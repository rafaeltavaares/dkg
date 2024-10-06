package dkg.metric.demo.Repositories;

import dkg.metric.demo.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.parser.Entity;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Long> {



}
