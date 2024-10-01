package dkg.metric.demo.Repositories;

import dkg.metric.demo.Entities.Search;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearshRepository extends JpaRepository<Search,Long> {
}
