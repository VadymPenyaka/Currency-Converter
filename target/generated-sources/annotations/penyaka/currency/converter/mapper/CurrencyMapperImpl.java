package penyaka.currency.converter.mapper;

import javax.annotation.processing.Generated;
import penyaka.currency.converter.entity.Currency;
import penyaka.currency.converter.model.CurrencyDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-30T01:31:48+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
public class CurrencyMapperImpl implements CurrencyMapper {

    @Override
    public CurrencyDTO currencyToCurrencyDto(Currency currency) {
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

    @Override
    public Currency currencyDtoToCurrency(CurrencyDTO currencyDTO) {
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
}
