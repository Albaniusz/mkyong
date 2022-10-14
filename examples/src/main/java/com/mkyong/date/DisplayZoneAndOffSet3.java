package com.mkyong.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DisplayZoneAndOffSet3 {
    public static final boolean SORT_BY_REGION = false;

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        Map<String, String> result = ZoneId.getAvailableZoneIds()
                .stream()
                .map(ZoneId::of)
                .map(zoneId -> new SimpleEntry<>(zoneId.toString(), localDateTime.atZone(zoneId)
                        .getOffset()
                        .getId()
                        .replaceAll("Z", "+00:00")))
                .sorted(SORT_BY_REGION
                        ? Map.Entry.comparingByKey()
                        : Map.Entry.<String, String>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        SimpleEntry::getKey,
                        SimpleEntry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));

        result.forEach((k, v) -> System.out.printf(String.format("%35s (UTC%s) %n", k, v)));

        System.out.println("\nTotal Zone IDs " + result.size());
    }
}
