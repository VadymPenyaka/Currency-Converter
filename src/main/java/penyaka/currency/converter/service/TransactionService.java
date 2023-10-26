package penyaka.currency.converter.service;

import penyaka.currency.converter.model.EmployeeDTO;
import penyaka.currency.converter.model.TransactionDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TransactionService {
    List<TransactionDTO> getAllTransactions ();

    Optional<TransactionDTO> getTransactionById (UUID id);

    TransactionDTO createTransaction (EmployeeDTO employeeDTO);

    Optional<EmployeeDTO> updateTransactionById (UUID id, TransactionDTO transactionDTO);
}
