package dkg.metric.demo.Entities;


import jakarta.persistence.*;
import lombok.*;

@Table
@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Search {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private Long totalResults;

    private Double searchTime;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Users user_id;

}
