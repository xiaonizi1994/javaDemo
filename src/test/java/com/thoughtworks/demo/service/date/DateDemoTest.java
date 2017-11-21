package com.thoughtworks.demo.service.date;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DateDemoTest {
    @Test
    void should_return_format_current_date() {
        DateDemo dateDemo=new DateDemo();
        Date date=new Date(2017,11,21,21,10,12);
        DateHelp dateHelp=mock(DateHelp.class);
        String t=dateDemo.formatDate();
        when(dateHelp.getCurrentDate()).thenReturn(date);
        assertEquals("2017.11.21 at 21:10:12",t);
    }
}
