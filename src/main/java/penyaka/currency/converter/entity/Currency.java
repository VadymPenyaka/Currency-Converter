package penyaka.currency.converter.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@Table(name = "CURRENCY")
@NoArgsConstructor
@AllArgsConstructor
public class Currency {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private double amount;
    @NotNull
    private double rate;
    @NotNull
    @NotBlank
    private String fullName;
    @NotNull
    @NotBlank
    private String shortName;
    @NotNull
    private LocalDate rateDate;
    @OneToMany(mappedBy = "foreignCurrency")
    private Set<Transaction> transactions;
}
