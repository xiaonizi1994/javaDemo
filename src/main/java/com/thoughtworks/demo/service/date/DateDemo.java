package com.thoughtworks.demo.service.date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DateDemo {
    @Autowired
    DateHelp dateHelp;

    public String formatDate(){
        DateHelp dateHelp=new DateHelp();
        Date currentDate=dateHelp.getCurrentDate();
        SimpleDateFormat ft=new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss");
        return ft.format(currentDate);
    }
}
