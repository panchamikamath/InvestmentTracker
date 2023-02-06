package com.vp.investment_tracker.controller;

import com.vp.investment_tracker.service.InvestmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/investment")
public class InvestmentController {

    public InvestmentService investmentService;

    public InvestmentController(InvestmentService investmentService) {
        this.investmentService = investmentService;
    }

    @GetMapping("/getTotalMFInvestedValue")
    public long getTotalMutualFundsInvested(@RequestParam String userID) throws ExecutionException, InterruptedException {
        return investmentService.getTotalMutualFundsInvested(userID);
    }

    @GetMapping("/getTotalInvestedValue")
    public long getTotalInvested(@RequestParam String userID) throws ExecutionException, InterruptedException {
        return investmentService.getTotalInvestedValue(userID);
    }
}
