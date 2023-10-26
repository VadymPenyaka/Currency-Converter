package penyaka.currency.converter.model;
import lombok.*;

import java.util.UUID;

@Data
@Builder
public class EmployeeDTO {
    private UUID id;
    private String firstName;
    private String lastName;
    private String phone;
    private String login;
    private String password;

}
