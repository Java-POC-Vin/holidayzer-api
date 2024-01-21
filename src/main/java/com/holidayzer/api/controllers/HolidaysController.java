package com.holidayzer.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holidayzer.api.services.HolidaysService;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/holidays")
public class HolidaysController {
    private final HolidaysService holidaysService;

    public HolidaysController(HolidaysService holidaysService) {
        this.holidaysService = holidaysService;
    }

    @GetMapping
    public Map<String, String> getHolidays() {
        return holidaysService.getHolidays();
    }

    @GetMapping("/{date}")
    public String findHoliday(@PathVariable String date) {
        return holidaysService.isItHoliday(date);
    }

}
