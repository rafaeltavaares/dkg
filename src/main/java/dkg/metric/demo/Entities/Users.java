package dkg.metric.demo.Entities;

import dkg.metric.demo.DTOs.User.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table
@Entity
@Data
@Builder
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String first_name;

    private String last_name;

    private String CPF;

    private Date date_of_birth;


    public Users(UserDTO data){
        this.CPF = data.cpf();
        this.first_name = data.first_name();
        this.last_name = data.last_name();
        this.date_of_birth = data.birth_date();
    }


}

