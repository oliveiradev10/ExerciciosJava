package Aplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class InstanciandoDate2 {
    public static void main(String[] args) {

        LocalDate D04 = LocalDate.parse("2026-03-03");
        LocalDateTime d05 = LocalDateTime.parse("2026-03-03T01:30:26");
        Instant d06 = Instant.parse("2026-03-03T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;


        System.out.println("d04 = " + D04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(D04));
        System.out.println("d05 = " + fmt2.format(d05));
        System.out.println("d05 = " + fmt1.format(d05));

        System.out.println("d06 = " +fmt3.format((d06)));
        System.out.println("d05 = " + fmt4.format(d05));

    }
}
