package com.mkyong.date;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class StringToDate7 {
    public static void main(String[] argv) {
        String date = "2016-08-16T10:15:30+08:00";
        ZonedDateTime result = ZonedDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("ZonedDateTime : " + result);
        System.out.println("TimeZone : " + result.getZone());
        LocalDate localDate = result.toLocalDate();
        System.out.println("LocalDate : " + localDate);
    }
}
