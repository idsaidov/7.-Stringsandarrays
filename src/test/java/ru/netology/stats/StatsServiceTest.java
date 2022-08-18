package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    long[] sales = {10, 20, 30, 13, 1, 3, 5};

    @Test
    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        long expected = 3;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

}