package penyaka.currency.converter.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@Builder
//@Table(name = "currency")
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
//    @OneToOne(mappedBy = "currency")
//    private Transaction transaction;
}
