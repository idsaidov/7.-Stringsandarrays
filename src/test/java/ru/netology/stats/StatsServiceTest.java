package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.whichWasThePeakSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.whichWasTheMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSumAllSales() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.sumAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.averageAmountSalesInMonth(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCountSalesBelowAvgMonths() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.inWhichSalesWereBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountSalesAboveAvgMonths() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.inWhichSalesWereAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}