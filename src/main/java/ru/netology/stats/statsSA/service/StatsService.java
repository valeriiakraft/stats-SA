package ru.netology.stats.statsSA.service;

public class StatsService {
    public int totalOfAllSales(long[] sales) {
        int sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[(int) i]);
        }
        return sum;
    }

    public int averageSalesAmount(long[] sales) {
        int sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[(int) i]);
        }
        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        int average = averageSalesAmount(sales);
        int sumMonths = 0;
        for (long sale : sales) {
            if (sale <= average) {
                sumMonths = sumMonths + 1;
            }
        }
        return sumMonths;
    }

    public int aboveAverageSales(long[] sales) {
        int average = averageSalesAmount(sales);
        int sumMonths = 0;
        for (long sale : sales) {
            if (sale >= average) {
                sumMonths = sumMonths + 1;
            }
        }
        return sumMonths;
    }
}
