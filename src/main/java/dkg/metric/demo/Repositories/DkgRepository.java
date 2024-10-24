package dkg.metric.demo.Repositories;

import dkg.metric.demo.Entities.DKG.DkgMetric;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DkgRepository extends JpaRepository<DkgMetric,Long> {
}
