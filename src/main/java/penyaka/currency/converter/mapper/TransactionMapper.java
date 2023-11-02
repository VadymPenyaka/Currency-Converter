package penyaka.currency.converter.mapper;

import org.mapstruct.Mapper;
import penyaka.currency.converter.entity.Transaction;
import penyaka.currency.converter.model.TransactionDTO;
@Mapper
public interface TransactionMapper {
    Transaction transactionDtoToTransaction(TransactionDTO transactionDTO);
    TransactionDTO transactionToTransactionDto(Transaction transaction);
}
