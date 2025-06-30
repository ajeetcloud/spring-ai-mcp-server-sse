package org.springaimcpserversse;

import org.springaimcpserversse.service.StockService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAiMcpServerSseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAiMcpServerSseApplication.class, args);
    }

    @Bean
    public ToolCallbackProvider stockTools(StockService stockService) {
        return MethodToolCallbackProvider.builder().toolObjects(stockService).build();
    }

}
