package com.thoughtworks.demo.service.date;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@Slf4j
public class DateDemo {
    @Autowired
    DateHelp dateHelp;

    public String formatDate(){
        Date currentDate=dateHelp.getCurrentDate();
        SimpleDateFormat ft=new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss");
        String formatDate=ft.format(currentDate);
        return formatDate;
    }
}
