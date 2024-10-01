package dkg.metric.demo.Entities;


import dkg.metric.demo.DTOs.SearchContentDTO;
import dkg.metric.demo.DTOs.SearchDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

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

    private String totalResults;

    private Double searchTime;

    private LocalDateTime create_date;


    public Search(SearchContentDTO data){
        this.content = data.content();
        this.searchTime = data.SearchTime();
        this.totalResults = data.totalResults();
        this.create_date = LocalDateTime.now();

    }
}
