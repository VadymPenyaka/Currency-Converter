package penyaka.currency.converter.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class TransactionDTO {
    private UUID id;
    private LocalDateTime exchangeDate;
    private TransactionType transactionType;
    private double clientCurrencyAmount;
    private double bankCurrencyAmount;
    private CurrencyDTO  foreignCurrency;
    private EmployeeDTO employee;



}
