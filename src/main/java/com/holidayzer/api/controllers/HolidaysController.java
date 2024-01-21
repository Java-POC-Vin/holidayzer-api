package com.holidayzer.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/holidays")
public class HolidaysController {

    @GetMapping
    public Map<String, String> getHolidays() {
        Holidayzer holidays = new Holidayzer();
        return holidays.getHolidays();
    }

}
