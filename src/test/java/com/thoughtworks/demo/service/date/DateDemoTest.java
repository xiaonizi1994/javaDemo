package com.thoughtworks.demo.service.date;

import com.thoughtworks.demo.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@Slf4j
public class DateDemoTest extends BaseTest{
   @Autowired
   DateDemo dateDemo;

   @MockBean
   DateHelp dateHelp;

    @Test
    void should_return_format_current_date() {
        Calendar calendar=Calendar.getInstance();
        calendar.set(2017,Calendar.NOVEMBER,21,21,10,12);
        log.info(calendar.toString());
        Date date=calendar.getTime();
        when(dateHelp.getCurrentDate()).thenReturn(date);
        String t=dateDemo.formatDate();
        assertEquals("2017.11.21 at 21:10:12",t);
    }
}
