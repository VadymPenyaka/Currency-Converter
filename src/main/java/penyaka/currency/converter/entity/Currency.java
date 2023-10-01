package penyaka.currency.converter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
public class Currency {

    private Long id;
    private double rate;
    private String fullName;
    private String shortName;
    private LocalDate lastUpdateDate;

}
