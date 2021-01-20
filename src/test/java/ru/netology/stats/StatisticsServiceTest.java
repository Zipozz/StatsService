package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void SumAllMonth() {
        StatisticsService statsService = new StatisticsService();
        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.SumAllMonth(sales);
        int expected = 180;
        assertEquals(expected,actual);


    }

    @Test
    void AverageAmount() {
        StatisticsService statsService = new StatisticsService();
        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.AverageAmount(sales);
        int expected = 15;
        assertEquals(expected,actual);
    }

    @Test
    void MaxSalesMonth() {
        StatisticsService statsService = new StatisticsService();
        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.MaxSalesMonth(sales);
        int expected = 8;
        assertEquals(expected,actual);
    }

    @Test
    void MinSalesMonth() {
        StatisticsService statsService = new StatisticsService();
        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.MinSalesMonth(sales);
        int expected = 9;
        assertEquals(expected,actual);
    }

    @Test
    void MonthDownMid() {
        StatisticsService statsService = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.MonthDownMid(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void MonthUpMid() {
        StatisticsService statsService = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.MonthUpMid(sales);
        int expected = 7;
        assertEquals(expected, actual);
    }

}

