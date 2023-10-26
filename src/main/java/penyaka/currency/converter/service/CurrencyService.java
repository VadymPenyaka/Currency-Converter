package penyaka.currency.converter.service;

import penyaka.currency.converter.model.CurrencyDTO;
import java.util.List;
import java.util.Optional;

public interface CurrencyService {
    List<CurrencyDTO> getAllCurrencies ();
    Optional<CurrencyDTO> getCurrencyByID (Long id);
    Optional<CurrencyDTO> getCurrencyByName (String shortName);
    Optional<CurrencyDTO> updateCurrencyById (Long id);
}
