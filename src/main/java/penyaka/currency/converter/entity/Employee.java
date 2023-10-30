package penyaka.currency.converter.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Set;
import java.util.UUID;
@Entity
@Getter
@Setter
@Builder
//@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(generator = "UUID")
//    @Column(nullable = false, name = "id")
    private UUID id;
    @NotNull
    @NotBlank
//    @Column(name = "first_name")
    private String firstName;
    @NotNull
    @NotBlank
//    @Column(name = "last_name")
    private String lastName;
    @NotNull
    @NotBlank
//    @Column(name = "phone")
    private String phone;
    @NotNull
    @NotBlank
//    @Column(name = "login")
    private String login;
    @NotNull
    @NotBlank
//    @Column(name = "password")
    private String password;

//    @OneToMany
//    private Set<Transaction> transactions;
}
