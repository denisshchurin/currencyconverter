package com.denis.currencyconverter.repository;

import com.denis.currencyconverter.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrenciesRepository extends JpaRepository<Currency, Long> {
}
