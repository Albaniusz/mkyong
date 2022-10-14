package com.mkyong.date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantZonedDateTime {
    public static void main(String[] argv) {
        // Z = UTC+0
        Instant instant = Instant.now();

        System.out.println("Instant : " + instant);

        // Japan = UTC+9
        ZonedDateTime jpTime = instant.atZone(ZoneId.of("Asia/Tokyo"));

        System.out.println("ZonedDateTime : " + jpTime);

        System.out.println("OffSet : " + jpTime.getOffset());
    }
}
