package ru.netology.stats;

public class StatsService {

    public int whichWasThePeakSales(long[] sales) {
        int month = 0;
        int maxMonth = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int whichWasTheMinSales(long[] sales) {
        int month = 0;
        int minMonth = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long  averageAmountSalesInMonth(long[] sales) {
        long average = sumAllSales(sales) / sales.length;
        return average;
    }
    public int inWhichSalesWereBelowAverage(long[] sales) {
        int months = 0;
        long average = averageAmountSalesInMonth(sales);
        for (long sale : sales) {
            if (sale < average) {
                months++;
            }
        }
        return months;
    }

    public int inWhichSalesWereAboveAverage(long[] sales) {
        int months = 0;
        long average = averageAmountSalesInMonth(sales);
        for (long sale : sales) {
            if (sale > average) {
                months++;
            }
        }
        return months;
    }

}