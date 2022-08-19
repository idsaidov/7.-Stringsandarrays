package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

}