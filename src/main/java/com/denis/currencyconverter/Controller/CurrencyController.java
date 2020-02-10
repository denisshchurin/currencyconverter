package com.denis.currencyconverter.Controller;

import com.denis.currencyconverter.service.CurrencyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurrencyController {
    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/converter")
    public String converter(){

        return "converter";
    }
}
