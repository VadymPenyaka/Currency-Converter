package penyaka.currency.converter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import penyaka.currency.converter.model.TransactionType;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @NotNull
    private LocalDateTime exchangeDate;
    @NotNull
    private TransactionType transactionType;
    @NotNull
    private double clientCurrencyAmount;
    @NotNull
    private double bankCurrencyAmount;
//    @NotNull
//    private Currency clientCurrency;
//    @NotNull
//    private Currency  backCurrency;
    //private Employee employee;

}
