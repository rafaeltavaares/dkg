package dkg.metric.demo.Entities;


import dkg.metric.demo.DTOs.SearchContentDTO;
import dkg.metric.demo.DTOs.SearchDTO;
import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.User;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Table(name = "queryrequest")
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

    private String total_results;

    private Double search_time;

    private LocalDateTime create_date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user_id;


    public Search(SearchContentDTO data){
        this.content = data.content();
        this.search_time = data.SearchTime();
        this.total_results = data.totalResults();
        this.create_date = LocalDateTime.now();
        this.user_id = null;
    }
    public Search(SearchContentDTO data, Optional<Users> user){
        this.content = data.content();
        this.search_time = data.SearchTime();
        this.total_results = data.totalResults();
        this.create_date = LocalDateTime.now();
        this.user_id = user.get();
    }
}
