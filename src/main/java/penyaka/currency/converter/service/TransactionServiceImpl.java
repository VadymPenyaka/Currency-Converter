package penyaka.currency.converter.service;

import penyaka.currency.converter.model.EmployeeDTO;
import penyaka.currency.converter.model.TransactionDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class TransactionServiceImpl implements TransactionService {
    @Override
    public List<TransactionDTO> getAllTransactions() {
        return null;
    }

    @Override
    public Optional<TransactionDTO> getTransactionById(UUID id) {
        return Optional.empty();
    }

    @Override
    public TransactionDTO createTransaction(EmployeeDTO employeeDTO) {
        return null;
    }

    @Override
    public Optional<EmployeeDTO> updateTransactionById(UUID id, TransactionDTO transactionDTO) {
        return Optional.empty();
    }
}
