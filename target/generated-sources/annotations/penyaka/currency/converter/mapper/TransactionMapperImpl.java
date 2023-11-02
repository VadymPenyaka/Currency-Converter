package penyaka.currency.converter.mapper;

import javax.annotation.processing.Generated;
import penyaka.currency.converter.entity.Currency;
import penyaka.currency.converter.entity.Employee;
import penyaka.currency.converter.entity.Transaction;
import penyaka.currency.converter.model.CurrencyDTO;
import penyaka.currency.converter.model.EmployeeDTO;
import penyaka.currency.converter.model.TransactionDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-02T03:21:37+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public Transaction transactionDtoToTransaction(TransactionDTO transactionDTO) {
        if ( transactionDTO == null ) {
            return null;
        }

        Transaction.TransactionBuilder transaction = Transaction.builder();

        transaction.id( transactionDTO.getId() );
        transaction.exchangeDate( transactionDTO.getExchangeDate() );
        transaction.transactionType( transactionDTO.getTransactionType() );
        transaction.clientCurrencyAmount( transactionDTO.getClientCurrencyAmount() );
        transaction.bankCurrencyAmount( transactionDTO.getBankCurrencyAmount() );
        transaction.foreignCurrency( currencyDTOToCurrency( transactionDTO.getForeignCurrency() ) );
        transaction.employee( employeeDTOToEmployee( transactionDTO.getEmployee() ) );

        return transaction.build();
    }

    @Override
    public TransactionDTO transactionToTransactionDto(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }

        TransactionDTO.TransactionDTOBuilder transactionDTO = TransactionDTO.builder();

        transactionDTO.id( transaction.getId() );
        transactionDTO.exchangeDate( transaction.getExchangeDate() );
        transactionDTO.transactionType( transaction.getTransactionType() );
        transactionDTO.clientCurrencyAmount( transaction.getClientCurrencyAmount() );
        transactionDTO.bankCurrencyAmount( transaction.getBankCurrencyAmount() );
        transactionDTO.foreignCurrency( currencyToCurrencyDTO( transaction.getForeignCurrency() ) );
        transactionDTO.employee( employeeToEmployeeDTO( transaction.getEmployee() ) );

        return transactionDTO.build();
    }

    protected Currency currencyDTOToCurrency(CurrencyDTO currencyDTO) {
        if ( currencyDTO == null ) {
            return null;
        }

        Currency.CurrencyBuilder currency = Currency.builder();

        currency.id( currencyDTO.getId() );
        currency.rate( currencyDTO.getRate() );
        currency.fullName( currencyDTO.getFullName() );
        currency.shortName( currencyDTO.getShortName() );

        return currency.build();
    }

    protected Employee employeeDTOToEmployee(EmployeeDTO employeeDTO) {
        if ( employeeDTO == null ) {
            return null;
        }

        Employee.EmployeeBuilder employee = Employee.builder();

        employee.id( employeeDTO.getId() );
        employee.firstName( employeeDTO.getFirstName() );
        employee.lastName( employeeDTO.getLastName() );
        employee.phone( employeeDTO.getPhone() );
        employee.login( employeeDTO.getLogin() );
        employee.password( employeeDTO.getPassword() );

        return employee.build();
    }

    protected CurrencyDTO currencyToCurrencyDTO(Currency currency) {
        if ( currency == null ) {
            return null;
        }

        CurrencyDTO.CurrencyDTOBuilder currencyDTO = CurrencyDTO.builder();

        currencyDTO.id( currency.getId() );
        currencyDTO.rate( currency.getRate() );
        currencyDTO.fullName( currency.getFullName() );
        currencyDTO.shortName( currency.getShortName() );

        return currencyDTO.build();
    }

    protected EmployeeDTO employeeToEmployeeDTO(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDTO.EmployeeDTOBuilder employeeDTO = EmployeeDTO.builder();

        employeeDTO.id( employee.getId() );
        employeeDTO.firstName( employee.getFirstName() );
        employeeDTO.lastName( employee.getLastName() );
        employeeDTO.phone( employee.getPhone() );
        employeeDTO.login( employee.getLogin() );
        employeeDTO.password( employee.getPassword() );

        return employeeDTO.build();
    }
}
