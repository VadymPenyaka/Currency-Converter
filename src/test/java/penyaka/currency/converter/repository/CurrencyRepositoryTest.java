package penyaka.currency.converter.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import penyaka.currency.converter.entity.Currency;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CurrencyRepositoryTest {
    @Autowired
    CurrencyRepository currencyRepository;

    @Test
    void saveCurrencyTest () {
        Currency savedCurrency = currencyRepository.save(Currency
                .builder()
                .id(Long.valueOf(1))
                .fullName("Full name")
                .shortName("UAH")
                .rate(12.3)
                .rateDate(LocalDate.now())
                .build());

        currencyRepository.flush();
        assertThat(savedCurrency).isNotNull();
        assertThat(savedCurrency.getId()).isNotNull();
    }
}