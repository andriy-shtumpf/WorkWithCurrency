package info.sjd;

import info.sjd.model.ComercialCurrency;
import info.sjd.model.Currency;
import info.sjd.service.CurrencyTransformService;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ApplicationRunner {

    private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {

        Currency euro = new Currency("EUR", "Euro", 978, "€",2827);
        Currency usd = new Currency("USD", "American_Dollar", 840, "$",2540);
        Currency rub = new Currency("RUB", "Russian_Ruble", 643, "P",39);

        List<Currency> currencies = new ArrayList<>();

        currencies.add(euro);
        currencies.add(usd);
        currencies.add(rub);

        String currenciesAsText = CurrencyTransformService.getCurrenciesList(currencies);
        logger.info("\n" + currenciesAsText);

        List<ComercialCurrency> comercialCurrencies = CurrencyTransformService.getComercialCurrenciesFromText(currenciesAsText);

        for (ComercialCurrency comercialCurrency: comercialCurrencies) {
            logger.info(comercialCurrency.toString());
        }

    }
}
