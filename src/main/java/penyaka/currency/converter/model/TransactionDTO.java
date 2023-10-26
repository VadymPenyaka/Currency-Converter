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
    private String clientCurrencyName;//change to currency type
    private String  backCurrencyName;//change to currency type
    private EmployeeDTO employee;



}
