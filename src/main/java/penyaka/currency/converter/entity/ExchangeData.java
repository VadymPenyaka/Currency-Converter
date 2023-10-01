package penyaka.currency.converter.entity;

import java.time.LocalDateTime;

public class ExchangeData {
    private LocalDateTime exchangeDate;
    private ExchangeType exchangeType;
    private double clientCurrencyAmount;
    private double bankCurrencyAmount;
    private String clientCurrencyName;
    private String  backCurrencyName;
    private Client client;
    private Employee employee;

}
