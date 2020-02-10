package com.denis.currencyconverter.service;

import com.denis.currencyconverter.model.History;
import com.denis.currencyconverter.repository.HistoryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class HistoryService {
    private final HistoryRepository historyRepository;

    public HistoryService(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

//    public List<History> findHistory() {
//        return historyRepository.findAll();
//    }

    public List<History> findDatedHistory(LocalDate date) {
        return historyRepository.findAllByDate(date);
    }

    public List<History> findAllHistory() {
        return historyRepository.findAll();
    }
}
