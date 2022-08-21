package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    void shouldWasThePeakSales() {
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.whichWasThePeakSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldWasTheMinSales() {
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.whichWasTheMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSumAllSales() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.sumAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldAverageAmountSalesInMonth() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.averageAmountSalesInMonth(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldSalesWereBelowAverage() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.inWhichSalesWereBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSalesWereAboveAverage() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.inWhichSalesWereAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}