package com.holidayzer.api.controllers;

import java.util.HashMap;
import java.util.Map;

public class Holidayzer {
    private Map<String, String> holidays = new HashMap<>();

    public Holidayzer() {
        buildHolidays();
    }

    private void buildHolidays() {
        this.holidays.put("01-01-2024", "Confraternização Mundial");
        this.holidays.put("12-02-2024", "Carnaval");
        this.holidays.put("13-02-2024", "Carnaval");
        this.holidays.put("29-03-2024", "Sexta-feira Santa");
        this.holidays.put("21-04-2024", "Tiradentes");
        this.holidays.put("01-05-2024", "Dia do Trabalho");
        this.holidays.put("30-05-2024", "Corpus Christi");
        this.holidays.put("07-09-2024", "Independência do Brasil");
        this.holidays.put("12-10-2024", "Nossa Senhora Aparecida");
        this.holidays.put("02-11-2024", "Finados");
        this.holidays.put("15-11-2024", "Proclamação da República");
        this.holidays.put("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra");
        this.holidays.put("25-12-2024", "Natal");
    }

    public Map<String, String> getHolidays() {
        return this.holidays;
    }

}
