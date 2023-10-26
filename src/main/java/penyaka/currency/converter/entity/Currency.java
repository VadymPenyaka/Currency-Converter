package penyaka.currency.converter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Currency {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private double rate;
    @NotNull
    @NotBlank
    private String fullName;
    @NotNull
    @NotBlank
    private String shortName;
    private LocalDate lastUpdateDate;

}
