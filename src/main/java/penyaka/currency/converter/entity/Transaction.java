package penyaka.currency.converter.entity;

import jakarta.persistence.*;
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
//    @Column(name = "id")
    private UUID id;
    @NotNull
//    @Column(name = "exchange_date")
    private LocalDateTime exchangeDate;
    @NotNull
//    @Column(name = "transaction_type")
    private TransactionType transactionType;
    @NotNull
//    @Column(name = "client_currency_name")
    private double clientCurrencyAmount;
    @NotNull
//    @Column(name = "bank_currency_amount")
    private double bankCurrencyAmount;
//    private Currency clientCurrency;
//    private Employee employee;

}
