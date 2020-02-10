package com.denis.currencyconverter.repository;

import com.denis.currencyconverter.model.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface HistoryRepository extends CrudRepository<History, Long> {

    List<History> findAllByDate(LocalDate date);
    List<History> findAll();


}
