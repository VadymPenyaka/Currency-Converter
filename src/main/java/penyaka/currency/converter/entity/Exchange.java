package penyaka.currency.converter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
public class Exchange {
    private UUID id;
    private LocalDateTime exchangeDate;
    private ExchangeType exchangeType;
    private double clientCurrencyAmount;
    private double bankCurrencyAmount;
    private String clientCurrencyName;
    private String  backCurrencyName;
    private Client client;
    private Employee employee;

}
