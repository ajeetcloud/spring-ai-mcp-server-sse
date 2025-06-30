package org.springaimcpserversse.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Tool(description = "Get the stock price for company")
    public String getStockPrice(String companyName) {
        if (companyName.equalsIgnoreCase("infosys")) {
            return "The stock price of Infosys in Rs 100. Valuations are attractive now.";
        }
        if (companyName.equalsIgnoreCase("TCS")) {
            return "The stock price of TCS in Rs 200. Valuations are expensive.";
        }
        return "I don't have the information about this company.";
    }
}
