package penyaka.currency.converter.mapper;

import penyaka.currency.converter.entity.Transaction;
import penyaka.currency.converter.model.TransactionDTO;

public interface TransactionMapper {
    Transaction transactionDtoToTransaction (TransactionDTO transactionDTO);
    TransactionDTO transactionToTransactionDto (Transaction transaction);
}
