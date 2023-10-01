package penyaka.currency.converter.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
public class Employee {
    private UUID id;
    private String firatName;
    private String lastName;
    private String phone;
    private String login;
    private String password;
}
