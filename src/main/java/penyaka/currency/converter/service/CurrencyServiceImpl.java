package penyaka.currency.converter.service;

import penyaka.currency.converter.model.CurrencyDTO;

import java.util.List;
import java.util.Optional;

public class CurrencyServiceImpl implements CurrencyService {
    @Override
    public List<CurrencyDTO> getAllCurrencies() {
        return null;
    }

    @Override
    public Optional<CurrencyDTO> getCurrencyByID(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<CurrencyDTO> getCurrencyByName(String shortName) {
        return Optional.empty();
    }

    @Override
    public Optional<CurrencyDTO> updateCurrencyById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteCurrencyById(Long id) {

    }
}
