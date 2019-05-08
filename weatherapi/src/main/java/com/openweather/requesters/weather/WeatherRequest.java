package com.openweather.requesters.weather;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import static com.openweather.statics.WeatherStatics.API_KEY;
import static com.openweather.statics.WeatherStatics.WEATHER_API_BASE_URI;
import static net.serenitybdd.rest.RestRequests.given;


public class WeatherRequest {

    @Step("Get Current Weather Data By City Name")
    public void get_current_weather_data_by_city_name(String cityName) {

        given()
                .baseUri(WEATHER_API_BASE_URI)
                .basePath("/weather")
                .queryParam("q", cityName)
                .queryParam("APPID", API_KEY).
        when()
                .get().
        then()
                .statusCode(200);
    }
}