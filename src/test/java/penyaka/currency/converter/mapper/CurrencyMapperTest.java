package penyaka.currency.converter.mapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import penyaka.currency.converter.entity.Currency;
import penyaka.currency.converter.model.CurrencyDTO;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CurrencyMapperImpl.class})
class CurrencyMapperTest {

    @Autowired
    CurrencyMapper currencyMapper;

    @Test
    void currencyToCurrencyDtoTest() {
        Currency currency = Currency.builder()
                .id(Long.valueOf(1))
                .fullName("Full name")
                .shortName("UAH")
                .rate(12.3)
                .rateDate(LocalDate.now())
                .build();

        CurrencyDTO currencyDTO = currencyMapper.currencyToCurrencyDto(currency);

        assertThat(currencyDTO.getFullName()).isEqualTo(currency.getFullName());
    }

    @Test
    void currencyDtoToCurrencyTest() {
        CurrencyDTO currencyDTO = CurrencyDTO.builder()
                .id(Long.valueOf(1))
                .fullName("Full name")
                .shortName("UAH")
                .rate(12.3)
                .lastUpdateDate(LocalDate.now())
                .build();

        Currency currency = currencyMapper.currencyDtoToCurrency(currencyDTO);

        assertThat(currencyDTO.getFullName()).isEqualTo(currency.getFullName());
    }
}