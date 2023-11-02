package penyaka.currency.converter.mapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import penyaka.currency.converter.entity.Currency;
import penyaka.currency.converter.entity.Employee;
import penyaka.currency.converter.entity.Transaction;
import penyaka.currency.converter.model.CurrencyDTO;
import penyaka.currency.converter.model.EmployeeDTO;
import penyaka.currency.converter.model.TransactionDTO;
import penyaka.currency.converter.model.TransactionType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TransactionMapperImpl.class)
class TransactionMapperTest {

    @Autowired
    TransactionMapper transactionMapper;

    @Test
    void transactionDtoToTransactionTest() {
        CurrencyDTO currencyDTO = CurrencyDTO
                .builder()
                .id(Long.valueOf(1))
                .fullName("Full name")
                .shortName("UAH")
                .rate(12.3)
                .rateDate(LocalDate.now())
                .build();

        EmployeeDTO employeeDTO = EmployeeDTO.builder()
                .id(UUID.randomUUID())
                .firstName("Firstname")
                .lastName("Lastname")
                .phone("1234567890")
                .login("login")
                .password("Password123")
                .build();



        TransactionDTO transactionDTO = TransactionDTO.builder()
                .id(UUID.randomUUID())
                .transactionType(TransactionType.BUY)
                .bankCurrencyAmount(123.3)
                .foreignCurrency(currencyDTO)
                .clientCurrencyAmount(1)
                .exchangeDate(LocalDateTime.now())
                .employee(employeeDTO)
                .build();

        Transaction transaction = transactionMapper.transactionDtoToTransaction(transactionDTO);

        assertThat(transaction.getId()).isEqualTo(transactionDTO.getId());
    }

    @Test
    void transactionToTransactionDtoTest() {
        Currency currency = Currency
                .builder()
                .id(Long.valueOf(1))
                .fullName("Full name")
                .shortName("UAH")
                .rate(12.3)
                .rateDate(LocalDate.now())
                .build();

        Employee employee = Employee.builder()
                .id(UUID.randomUUID())
                .firstName("Firstname")
                .lastName("Lastname")
                .phone("1234567890")
                .login("login")
                .password("Password123")
                .build();



        Transaction transaction = Transaction.builder()
                .id(UUID.randomUUID())
                .transactionType(TransactionType.BUY)
                .bankCurrencyAmount(123.3)
                .foreignCurrency(currency)
                .clientCurrencyAmount(1)
                .exchangeDate(LocalDateTime.now())
                .employee(employee)
                .build();

        TransactionDTO transactionDTO = transactionMapper.transactionToTransactionDto(transaction);

        assertThat(transaction.getId()).isEqualTo(transactionDTO.getId());
    }
}