package dkg.metric.demo.Entities.DKG;

import dkg.metric.demo.Entities.Search;
import dkg.metric.demo.Entities.Users;
import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "dkg_data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Data
@Builder
public class DkgMetric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dkg_id;

    private double QsimCoef;

    private int Ci;

    private Double CoefObservabilidade;

    private Double sum_pi;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user_id;

    private Date created_on;



}
