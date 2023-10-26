package penyaka.currency.converter.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Currency {

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
