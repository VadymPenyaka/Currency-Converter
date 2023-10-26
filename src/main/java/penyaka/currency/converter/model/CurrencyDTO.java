package penyaka.currency.converter.model;

import lombok.*;

import java.time.LocalDate;
@Data
@Builder
public class CurrencyDTO {
    private Long id;
    private double rate;
    private String fullName;
    private String shortName;
    private LocalDate lastUpdateDate;
}
