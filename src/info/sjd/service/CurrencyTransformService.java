package info.sjd.service;

import info.sjd.model.ComercialCurrency;
import info.sjd.model.Currency;

import java.util.ArrayList;
import java.util.List;

public class CurrencyTransformService {
    public static String getCurrenciesList(List<Currency> currencies) {
        String currenciesList = "";
        for (Currency currency : currencies) {
            currenciesList += currency.toString() + "\n"; // currenciesList = currenciesList + currency.toString() + "\n";
        }

        return currenciesList;
    }

    public static ComercialCurrency getComercialCurrency(Currency currency) {
        Integer buyValue = currency.getValue() * 120 / 100;
        Integer sellValue = currency.getValue() * 140 / 100;

        return new ComercialCurrency(currency.getShortName(), currency.getFullName(), currency.getCode(), currency.getSymbol(),currency.getValue(), buyValue, sellValue);
    }

    public static List<ComercialCurrency> getComercialCurrenciesFromText(String currenciesAsText){
        List<ComercialCurrency> comercialCurrencies = new ArrayList<>();
            String[] lines = currenciesAsText.split("\n");
        for (String line : lines) {
            Currency currency = getCurrencyFromLine(line);
            ComercialCurrency comercialCurrency = getComercialCurrency(currency);
            comercialCurrencies.add(comercialCurrency);

        }
        return comercialCurrencies;
    }

    private static Currency getCurrencyFromLine(String line) {
        String[] words = line.split(" ");
        return new Currency(words[0], words[1], Integer.parseInt(words[2]), words[3], Integer.parseInt(words[4]));

    }

}
