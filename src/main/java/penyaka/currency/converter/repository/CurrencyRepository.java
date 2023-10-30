package penyaka.currency.converter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import penyaka.currency.converter.entity.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
