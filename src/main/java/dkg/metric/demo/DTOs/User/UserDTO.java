package dkg.metric.demo.DTOs.User;

import java.util.Date;

public record UserDTO(
        String first_name,
        String last_name,
        String cpf,
        Date birth_date
) {
}
