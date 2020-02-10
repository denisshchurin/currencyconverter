package com.denis.currencyconverter.service;

import com.denis.currencyconverter.repository.CurrenciesRepository;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
    private final CurrenciesRepository currenciesRepository;

    public CurrencyService(CurrenciesRepository currenciesRepository) {
        this.currenciesRepository = currenciesRepository;
    }
}
