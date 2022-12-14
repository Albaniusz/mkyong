package com.mkyong.date;

import java.time.*;

public class ZonedDateTimeInstant {
    public static void main(String[] argv) {
        LocalDateTime dateTime = LocalDateTime.of(2016, Month.AUGUST, 18, 6, 57, 38);

        // UTC+9
        ZonedDateTime jpTime = dateTime.atZone(ZoneId.of("Asia/Tokyo"));

        System.out.println("ZonedDateTime : " + jpTime);

        // Convert to instant UTC+0/Z , java.time helps to reduce 9 hours
        Instant instant = jpTime.toInstant();

        System.out.println("Instant : " + instant);
    }
}
