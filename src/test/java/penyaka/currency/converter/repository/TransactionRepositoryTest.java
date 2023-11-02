package penyaka.currency.converter.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import penyaka.currency.converter.entity.Currency;
import penyaka.currency.converter.entity.Employee;
import penyaka.currency.converter.entity.Transaction;
import penyaka.currency.converter.model.TransactionType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class TransactionRepositoryTest {
    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    CurrencyRepository currencyRepository;

    @Test
    void testSaveTransaction () {
        Currency currency = Currency
                .builder()
                .id(Long.valueOf(1))
                .fullName("Full name")
                .shortName("UAH")
                .rate(12.3)
                .rateDate(LocalDate.now())
                .build();

        currencyRepository.save(currency);
        Employee employee = Employee.builder()
                .id(UUID.randomUUID())
                .firstName("Firstname")
                .lastName("Lastname")
                .phone("1234567890")
                .login("login")
                .password("Password123")
                .build();
        employeeRepository.save(employee);

        Transaction savedTransaction = transactionRepository.save(Transaction.builder()
                        .id(UUID.randomUUID())
                        .transactionType(TransactionType.BUY)
                        .bankCurrencyAmount(123.3)
                        .foreignCurrency(currency)
                        .clientCurrencyAmount(1)
                        .exchangeDate(LocalDateTime.now())
                        .employee(employee)
                        .build()
        );

        transactionRepository.flush();

        assertThat(savedTransaction).isNotNull();
        assertThat(savedTransaction.getId()).isNotNull();
    }

}