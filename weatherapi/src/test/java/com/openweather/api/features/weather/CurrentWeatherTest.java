package com.openweather.api.features.weather;

import com.openweather.requesters.weather.WeatherRequest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.openweather.statics.Tag.*;

@Narrative(text={"As a API user",
        "I want to get weather details via API."})
@RunWith(SerenityRunner.class)
@WithTags({
        @WithTag(WEATHER),
        @WithTag(CURRENT_WEATHER)
})
public class CurrentWeatherTest {

    @Steps
    WeatherRequest request;

    @Test
    @Title("Get Weather By City Name")
    public void getWeatherByCityName() {

        request.get_current_weather_data_by_city_name("London");
    }
}