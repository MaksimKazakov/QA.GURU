package ru.maximkazakov.workidea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HotKeysIDEA {
    @Test
    public void test() {
        String date = "19.09.2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // alt+ctrl+v выделить что нужно вынести в переменную
        LocalDate parseDate = LocalDate.parse(date, formatter); // либо дописать в конце .var + TAB автоматом вынесет в переменную

        Assertions.assertEquals(DayOfWeek.THURSDAY, parseDate.getDayOfWeek());



    }
}
