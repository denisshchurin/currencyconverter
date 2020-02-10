package com.denis.currencyconverter.Controller;

import com.denis.currencyconverter.model.History;
import com.denis.currencyconverter.service.HistoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HistoryController {
    private final HistoryService historyService;

    public HistoryController(HistoryService historyService) {
        this.historyService = historyService;
    }

    @GetMapping("/history")
    public String getEmptyHistory(Model model){

        History history = new History();
        model.addAttribute("history", history);

        // подумать как лучше взять это из БД
        List<String > valutes = new ArrayList<>();
        valutes.add("USD(Доллар США)");
        valutes.add("RUB(Российский рубль)");
        valutes.add("AUD(Австралийский доллар)");
        valutes.add("GBP(Фунт стерлингов Соединенного королевства)");
        model.addAttribute("valutes", valutes);

        return "history";
    }

    @PostMapping("/history")
    public String getDatedHistory(@Valid @ModelAttribute(name="history") History history, BindingResult result, Model model){
        // getDatedHistory(@Valid @ModelAttribute(name="history") History history, Model model)

        // проверить есть ли ошибки
        if (result.hasErrors()) {
            return "login";
        }

        List<History> histories = historyService.findDatedHistory(history.getDate());
//        List<History> histories = historyService.findAllHistory();
        model.addAttribute("histories", histories);
        return "dated-history";
    }

//    @GetMapping("/history")
//    public String getDatedHistory(Model model){
//
//        List<History> histories = historyService.findDatedHistory(LocalDate.of(2020,2,7));
//        model.addAttribute("histories", histories);
//        return "dated-history";
//    }

}
