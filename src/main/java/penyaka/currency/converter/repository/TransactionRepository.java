package penyaka.currency.converter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import penyaka.currency.converter.entity.Transaction;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
