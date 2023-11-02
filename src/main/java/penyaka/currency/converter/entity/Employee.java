package penyaka.currency.converter.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Set;
import java.util.UUID;
@Entity
@Getter
@Setter
@Builder
@Table(name = "EMPLOYEE")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(nullable = false, name = "id")
    private UUID id;
    @NotNull
    @NotBlank
    @Size (min = 2, max = 30, message = "First name should be between 2 and 30 chars")
    @Column(name = "first_name")
    private String firstName;
    @NotNull
    @NotBlank
    @Column(name = "last_name")
    @Size (min = 2, max = 30, message = "Last name should be between 2 and 30 chars")
    private String lastName;
    @NotNull
    @NotBlank
    @Column(name = "phone")
    @Size (min = 10, max = 10, message = "Incorrect phone format")
    private String phone;
    @NotNull
    @NotBlank
    @Column(name = "login")
    @Size (min = 2, max = 30, message = "Login should be between 2 and 18 chars")
    private String login;
    @NotNull
    @NotBlank
    @Column(name = "password")
    @Size (min = 8, max = 18, message = "Password should be between 8 and 18 chars")
    private String password;
    @OneToMany(mappedBy = "employee")
    private Set<Transaction> transactions;
}
