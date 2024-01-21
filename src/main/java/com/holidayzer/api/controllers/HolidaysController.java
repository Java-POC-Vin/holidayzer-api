package com.holidayzer.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/holidays")
public class HolidaysController {
    Holidayzer holidays = new Holidayzer();

    @GetMapping
    public Map<String, String> getHolidays() {
        return holidays.getHolidays();
    }

    @GetMapping("/{date}")
    public String findHoliday(@PathVariable String date) {
        return holidays.isItHoliday(date);
    }

}
