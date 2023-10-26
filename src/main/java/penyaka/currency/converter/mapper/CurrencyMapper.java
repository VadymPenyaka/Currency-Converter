package penyaka.currency.converter.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import penyaka.currency.converter.entity.Currency;
import penyaka.currency.converter.model.CurrencyDTO;

@Mapper
public interface CurrencyMapper {
    CurrencyMapper INSTANCE = Mappers.getMapper(CurrencyMapper.class);
    CurrencyDTO currencyToCurrencyDto (Currency currency);
    Currency currencyDtoToCurrency (CurrencyDTO currencyDTO);
}
