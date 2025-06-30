package org.springaimcpserversse.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Tool(description = "Get weather forecast for a specific latitude/longitude")
    public String getWeatherByLocation(int latitude, int longitude) {
        if (latitude == 10 && longitude == 10) {
            return "The forecast for latitude 10 longitude 10 is rainy weather";
        }
        if (latitude == 20 && longitude == 20) {
            return "The forecast for latitude 20 longitude 20 is stormy weather";
        }
        return "sunny weather";
    }
}
