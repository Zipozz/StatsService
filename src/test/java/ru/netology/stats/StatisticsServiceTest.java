package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void sumAllMonth() {
        StatisticsService statsService = new StatisticsService();
        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.sumAllMonth(sales);
        int expected = 180;
        assertEquals(expected,actual);


    }

    @Test
    void averageAmount() {
        StatisticsService statsService = new StatisticsService();
        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.averageAmount(sales);
        int expected = 15;
        assertEquals(expected,actual);
    }

    @Test
    void maxSalesMonth() {
        StatisticsService statsService = new StatisticsService();
        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.maxSalesMonth(sales);
        int expected = 8;
        assertEquals(expected,actual);
    }

    @Test
    void minSalesMonth() {
        StatisticsService statsService = new StatisticsService();
        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int actual = statsService.minSalesMonth(sales);
        int expected = 9;
        assertEquals(expected,actual);
    }

    @Test
    void monthDownMid() {
        StatisticsService statsService = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.monthDownMid(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void monthUpMid() {
        StatisticsService statsService = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = statsService.monthUpMid(sales);
        int expected = 7;
        assertEquals(expected, actual);
    }

}

