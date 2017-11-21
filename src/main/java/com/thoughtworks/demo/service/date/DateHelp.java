package com.thoughtworks.demo.service.date;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DateHelp {
    public Date getCurrentDate(){
        return new Date();
    }
}
